package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// TODO: 틀림....
public class 한동이 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static int[] graph;
   static boolean[] visited;
   static int result;
   static int count;
   static int temp;
   public static void main(String[] args) throws IOException {
      int n = Integer.parseInt(br.readLine());

      graph = new int[n + 1];
      visited = new boolean[n + 1];
      temp = Integer.MIN_VALUE;

      for (int i = 1; i < graph.length; i++) {
         graph[i] = Integer.parseInt(br.readLine());
      }

      for (int i = 1; i <= n; i++) {
         visited = new boolean[n + 1];
         dfs(i);

         if (temp < count) {
            temp = count;
            result = i;
         }

         count = 0;
      }

      System.out.println(result);
   }

   static void dfs(int startIdx) {
      visited[startIdx] = true;

      for (int i = 1; i < graph.length; i++) {
         if (!visited[graph[i]]) {
            count++;
            dfs(graph[i]);
         }
      }
   }
}
