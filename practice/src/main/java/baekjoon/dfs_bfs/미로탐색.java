package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 미로탐색 {
   static int n;
   static int m;
   static int[][] map;
   static boolean[][] visited;
   static Queue<Point> queue;
   static int[] dx = {0, 0, 1, -1};
   static int[] dy = {1, -1, 0, 0};
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   private static class Point {
      private final int x;
      private final int y;

      Point(int x, int y) {
         this.x = x;
         this.y = y;
      }

      public int getX() {
         return x;
      }

      public int getY() {
         return y;
      }
   }

   public static void main(String[] args) throws IOException {
      String[] in = br.readLine().split(" ");

      n = Integer.parseInt(in[0]);
      m = Integer.parseInt(in[1]);

      map = new int[n][m];
      queue = new LinkedList<>();
      visited = new boolean[n][m];

      for (int i = 0; i < n; i++) {
         String[] chs = br.readLine().split("");
         for (int j = 0; j < m; j++) {
            map[i][j] = Integer.parseInt(chs[j]);
         }
      }

      bfs(0, 0);


//      for (int i = 0; i < map.length; i++) {
//         for (int j = 0; j < map[i].length; j++) {
//            System.out.print(map[i][j] + " ");
//         }
//         System.out.println();
//      }

      System.out.println(map[n - 1][m - 1]);
   }

   private static void bfs(int x, int y) {
      queue.offer(new Point(x, y));
      visited[x][y] = true;

      while(!queue.isEmpty()) {
         Point point = queue.poll();
         int a = point.getX();
         int b = point.getY();

         if (x == n -1 && y == m - 1) {
            break;
         }

//         System.out.print(map[a][b] + "(x : " + a + ", y : " + b + ") -- > ");

         for (int i = 0; i < 4; i++) {
            int nx = a + dx[i];
            int ny = b + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
               continue;
            }

            if (!visited[nx][ny] && map[nx][ny] != 0) {
               queue.offer(new Point(nx, ny));
               visited[nx][ny] = true;
               map[nx][ny] += map[a][b];
            }
         }
      }

   }
}
