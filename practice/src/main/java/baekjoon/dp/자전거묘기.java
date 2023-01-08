package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 자전거묘기 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());
      int[] map = new int[N];
      int[] dp = new int[N];

      String[] in = br.readLine().split(" ");

      for (int i = 0; i < in.length; i++) {
         map[i] = Integer.parseInt(in[i]);
      }

      dp[N - 1] = 1;

      for (int i = map.length - 2; i >= 0; i--) {

         if (map[i] == 0) {
            dp[i] = dp[i + 1] + 1;
         } else {
            if (map[i] + i + 1 >= N) {
               dp[i] = 1;
            } else {
               dp[i] = dp[i + map[i] + 1] + 1;
            }
         }
      }

      for (int i : dp) {
         System.out.print(i + " ");
      }
   }
}
