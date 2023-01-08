package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 점프왕젤리 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static boolean[][] visited;
   static int[][] map;
   static int n;
   static int[] dirX = {1, 0};
   static int[] dirY = {0, 1};
   public static void main(String[] args) throws IOException {
      n = Integer.parseInt(br.readLine());

      visited = new boolean[n][n];
      map = new int[n][n];

      for (int i = 0; i < n; i++) {
         String[] arr = br.readLine().split(" ");
         for (int j = 0; j < n; j++) {
            map[i][j] = Integer.parseInt(arr[j]);
         }
      }

      dfs(0, 0);

      System.out.println("Hing");
   }

   static void dfs(int x, int y) {
      visited[x][y] = true;

      int jump = map[x][y];

      if (jump == -1) {
         System.out.println("HaruHaru");
         System.exit(0);
      }

      System.out.print(map[x][y] + " -> (index)[" + x +"][" + y + "] | ");

      for (int i = 0; i < 2; i++) {
         int nx = x + dirX[i] * jump;
         int ny = y + dirY[i] * jump;

         if (nx < n && ny < n && !visited[nx][ny]) {
            dfs(nx, ny);
         } else {
            continue;
         }
      }
//
//      if (x + jump < n && !visited[x + jump][y]) {
//         dfs(x + jump, y);
//      } else if (y + jump < n && !visited[x][y + jump]){
//         dfs(x , y + jump);
//      }

      System.out.println();
   }
}
