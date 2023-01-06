package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 유기농배추 {
   static BufferedReader br;
   static BufferedWriter bw;
   static boolean[][] visited;
   static int[][] map;
   static int result;
   static int[] dx = {1, -1, 0, 0};
   static int[] dy = {0, 0, 1, -1};
   static int N;
   static int M;
   public static void main(String[] args) throws IOException {
      br = new BufferedReader(new InputStreamReader(System.in));
      bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int T = Integer.parseInt(br.readLine());

      while (T != 0) {
         String[] input = br.readLine().split(" ");

         result = 0;

         M = Integer.parseInt(input[0]); // 가로 길이
         N = Integer.parseInt(input[1]); // 세로 길이
         int K = Integer.parseInt(input[2]);

         map = new int[N][M];
         visited = new boolean[N][M];

         for (int i = 0; i < K; i++) {
            String[] bat = br.readLine().split(" ");
            int x = Integer.parseInt(bat[0]);
            int y = Integer.parseInt(bat[1]);

            map[y][x] = 1;
         }

//         for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//               System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//         }

         for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

               if (!visited[i][j] && map[i][j] == 1) {
//                  System.out.println(j + "    ||||   " + i);
                  dfs(j, i);
                  result++;
               }
            }
         }

         bw.write(result + "\n");
         T--;
      }

      bw.flush();
      br.close();
      bw.close();
   }

   public static void dfs(int x, int y) {
      visited[y][x] = true;

//      System.out.print(map[y][x] + "(x : " + x + ", y : " + y + ") -- > ");


      for (int i = 0; i < 4; i++) {
         int newX = x + dx[i];
         int newY = y + dy[i];

         if (newX < 0 || newY < 0 || newX >= M || newY >= N) {
            continue;
         }

          if (!visited[newY][newX] && map[newY][newX] == 1) {
             dfs(newX, newY);
          }

      }
   }
}
