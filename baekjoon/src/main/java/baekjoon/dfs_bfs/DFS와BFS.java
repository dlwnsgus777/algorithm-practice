package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DFS와BFS {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static boolean[] visited;
   static int[][] graph;
   public static void main(String[] args) throws IOException {
      String[] arr = br.readLine().split(" ");

      int n = Integer.parseInt(arr[0]);
      int m = Integer.parseInt(arr[1]);
      int startIndex = Integer.parseInt(arr[2]);

      graph = new int[n + 1][n + 1];

      visited = new boolean[n + 1];

      for (int i = 0; i < m; i++) {
         String[] node = br.readLine().split(" ");
         int a = Integer.parseInt(node[0]);
         int b = Integer.parseInt(node[1]);

         graph[a][b] = graph[b][a] = 1;
      }

      dfs(startIndex);

      System.out.println();

      Arrays.fill(visited, false);

      bfs(startIndex);
   }

   private static void dfs(int nodeIndex) {
      visited[nodeIndex] = true;

      System.out.print(nodeIndex + " ");

      for (int i = 1; i < graph.length; i++) {
         if(graph[nodeIndex][i] == 1 && !visited[i]) {
            dfs(i);
         }
      }
   }

   private static void bfs(int nodeIndex) {
      Queue<Integer> queue = new LinkedList<>();

      queue.add(nodeIndex);
      visited[nodeIndex] = true;
      System.out.print(nodeIndex + " ");

      while (!queue.isEmpty()) {
         int temp = queue.poll();

         for (int i = 1; i < graph.length; i++) {
            if (graph[temp][i] == 1 && !visited[i]) {
               queue.add(i);
               visited[i] = true;
               System.out.print(i + " ");
            }
         }
      }
   }
}
