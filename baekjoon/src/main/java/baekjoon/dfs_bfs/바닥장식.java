package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 바닥장식 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static String[][] graph;
   static boolean[][] visited;
   static int xCount;
   static int yCount;
   static int n;
   static int m;

   public static void main(String[] args) throws IOException {
      String[] arr = br.readLine().split(" ");
      
      n = Integer.parseInt(arr[0]); // 세로 - y
      m = Integer.parseInt(arr[1]); // 가로 - x

      graph = new String[n][m];
      visited = new boolean[n][m];

      for (int i = 0; i < n; i++) {
         char[] tile = br.readLine().toCharArray();

         for (int j = 0; j < m; j++) {
            graph[i][j] = String.valueOf(tile[j]);
         }
      }

      xCount = 0;
      yCount = 0;

      for (int i = 0; i < graph.length; i++) {
         for (int j = 0; j < graph[i].length; j++) {
            if (!visited[i][j]) {
               dfs(j, i, graph[i][j]);

               if (graph[i][j].equals("-")) {
                  xCount++;
               } else {
                  yCount++;
               }
            }
         }
      }

      System.out.println(yCount + xCount);
   }

   private static void dfs(int x, int y, String tile) {
      visited[y][x] = true;
      int nx = x;
      int ny = y;

      if (tile.equals("-")) {
         nx = x + 1;
         if (nx >= 0 && nx < m && graph[y][nx].equals(tile) && !visited[y][nx]) {
            dfs(nx, y, graph[y][nx]);
         }
      } else {
         ny = y + 1;
         if (ny >= 0 && ny < n && graph[ny][x].equals(tile) && !visited[ny][x]) {
            dfs(x, ny, graph[ny][x]);
         }
      }
   }
}
