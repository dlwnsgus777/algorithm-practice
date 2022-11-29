package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class 바닥장식 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static String[][] graph;
   
   public static void main(String[] args) throws IOException {
      String[] arr = br.readLine().split(" ");
      
      int n = Integer.parseInt(arr[0]);
      int m = Integer.parseInt(arr[1]);

      graph = new String[n][m];

      for (int i = 0; i < n; i++) {
         char[] tile = br.readLine().toCharArray();

         for (int j = 0; j < m; j++) {
            graph[i][j] = String.valueOf(tile[j]);
         }
      }

      System.out.println("*************************");
      int count = 0;

      for (int i = 0; i < graph.length; i++) {
         int tmp = 0;
         for (int j = 0; j < graph[i].length; j++) {
            if (graph[i][j].equals("|")) {
               tmp = 0;
            } else {
               count++;
            }
         }
      }

      for (int i = 0; i < graph.length; i++) {
         int tmp = 0;
         for (int j = 0; j < graph[i].length; j++) {
            if (graph[j][i].equals("-")) {
               tmp = 0;
            } else {
               count++;
            }
         }
      }

      System.out.println(count);
   }
}
