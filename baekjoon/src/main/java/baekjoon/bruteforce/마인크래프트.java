package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 풀이 참조 함
public class 마인크래프트 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String[] input = br.readLine().split(" ");

      int N = Integer.parseInt(input[0]);
      int M = Integer.parseInt(input[1]);
      int B = Integer.parseInt(input[2]);

      int[][] map = new int[N][M];
      int max = -1;
      int min = 257;

      int second = Integer.MAX_VALUE;
      int height = -1;

      for (int i = 0; i < N; i++) {
         String[] arr = br.readLine().split(" ");

         for (int j = 0; j < M; j++) {
            int number = Integer.parseInt(arr[j]);
            map[i][j] = number;

            if (number > max) {
               max = number;
            } else if (number <= min) {
               min = number;
            }
         }
      }

      for (int i = min; i <= max ; i++) {
         int se = 0;
         int invent = B;

         for (int j = 0; j < N; j++) {

            for (int k = 0; k < M; k++) {
               int diff = map[j][k] - i;

               if (diff > 0) {
                  se += Math.abs(diff) * 2;
                  invent += Math.abs(diff);
               } else if (diff < 0) {
                  se += Math.abs(diff);
                  invent -= Math.abs(diff);
               }

            }
         }

         if (invent >= 0) {
            if (se <= second) {
               second = se;
               height = i;
            }
         }

      }

      System.out.println(second + " " + height);
   }
}
