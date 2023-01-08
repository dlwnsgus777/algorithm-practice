package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;

public class 음식물피하기_DFS {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static int n;
   static int m;
   static int k;
   static int[][] map;
   static boolean[][] visited;
   static int[] dx = {1, -1, 0, 0};
   static int[] dy = {0, 0, -1, 1};
   static int result;
   static int cnt;
   public static void main(String[] args) throws IOException {
      String[] arr = br.readLine().split(" ");

      n = Integer.parseInt(arr[0]);
      m = Integer.parseInt(arr[1]);
      k = Integer.parseInt(arr[2]);

      map = new int[n][m];
      visited = new boolean[n][m];
      cnt = 0;
      result = 0;

      for (int i = 0; i < k; i++) {
         String[] stt = br.readLine().split(" ");
         int r = Integer.parseInt(stt[0]);
         int c = Integer.parseInt(stt[1]);

         map[r - 1][c - 1] = 1;
      }

//      System.out.println("*****************************");

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            if (map[i][j] == 1 && !visited[i][j]) {
               dfs(i, j);
               result = Math.max(result, cnt);
            } else {
               cnt = 0;
            }
//            System.out.print(map[i][j] + " ");
         }
//         System.out.println();
      }

      System.out.println(result);

//      dfs(0, 0);
   }

   private static void bfs() {

   }

   private static void dfs(int x, int y) {
      visited[x][y] = true;
      cnt++;
//      System.out.print(map[x][y] + "(x : " + x + ", y : " + y + ") -- > ");

      for (int i = 0; i < 4; i++) {

         int nx = x + dx[i];
         int ny = y + dy[i];
//         System.out.println("(x : " + nx + ", y : " + ny + ")");

         if (nx < 0 || ny < 0 || nx >= n || ny >= m) {

            continue;
         }

         if (!visited[nx][ny] && map[nx][ny] != 0) {
            dfs(nx, ny);
         }
      }

   }
}
