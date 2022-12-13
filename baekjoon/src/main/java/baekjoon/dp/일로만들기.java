package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일로만들기 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static int cnt;
   static int[] dp;
   public static void main(String[] args) throws IOException {
      int n = Integer.parseInt(br.readLine());
      cnt = 0;
      dp = new int[1000001];
      Arrays.fill(dp, -1);



   }

//   private static int dp(int n) {
//      if (n == 1) {
//         return 0;
//      }
//
//      if (dp[n] != -1) {
//         return dp[n];
//      }
//
//      int result = dp(n - 1) + 1;
//      if (n % 3 == 0) {
//      }
//   }
}
