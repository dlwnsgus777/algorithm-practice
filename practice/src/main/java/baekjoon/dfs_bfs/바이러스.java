package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 바이러스 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static int[][] graph;
   static boolean[] visited;
   static int result;

   public static void main(String[] args) throws IOException {
      int n = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());

      graph = new int[n + 1][n + 1];
      visited = new boolean[n + 1];

      int startIndex = 1;

      result = 0;

      for (int i = 0; i < m; i++) {
         String[] arr = br.readLine().split(" ");
         int a = Integer.parseInt(arr[0]);
         int b = Integer.parseInt(arr[1]);

         graph[a][b] = graph[b][a] = 1;
      }

      dfs(startIndex);

      System.out.println(result);
   }

   static void dfs(int startIndex) {
      visited[startIndex] = true;

      for (int i = 1; i < graph.length; i++) {
         if (graph[startIndex][i] == 1 && !visited[i]) {
            result++;
            dfs(i);
         }
      }
   }
}
