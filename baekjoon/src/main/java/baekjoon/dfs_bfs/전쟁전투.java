package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 전쟁전투 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static String[][] graph;
   static boolean[][] visited;
   static int n;
   static int m;
   static int[] dx = {0, 0, 1, -1};
   static int[] dy = {1, -1, 0, 0};
   static int bCount;
   static int wCount;
   static int count;

   public static void main(String[] args) throws IOException {
      StringTokenizer st = new StringTokenizer(br.readLine());

      n = Integer.parseInt(st.nextToken());
      m = Integer.parseInt(st.nextToken());

      graph = new String[m][n];
      visited = new boolean[m][n];

      bCount = 0;
      wCount = 0;

      for (int i = 0; i < m; i++) {
         String a = br.readLine();
         char[] member = a.toCharArray();
         for (int j = 0; j < n; j++) {

            graph[i][j] = String.valueOf(member[j]);
         }

      }

      for (int i = 0; i < m; i++) { // y
         for (int j = 0; j < n; j++) { // x
            if (!visited[i][j]) {
               count = 0;
               dfs(j, i, graph[i][j]);

               if (graph[i][j].equals("W")) {
                  wCount += count * count;
               } else {
                  bCount += count * count;
               }
            }
         }
      }

      System.out.println(wCount);
      System.out.println(bCount);
   }

   private static void dfs(int x, int y, String flag) {
      visited[y][x] = true;

      count++;

      for (int i = 0; i < 4; i++) {
         int nx = x + dx[i];
         int ny = y + dy[i];

         if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[ny][nx] && graph[ny][nx].equals(flag)) {
            dfs(nx, ny, graph[ny][nx]);
         }
      }
   }
}
