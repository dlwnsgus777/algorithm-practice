package dongbinbook.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 바닥공사 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());
      int[] dp = new int[N + 1];

      dp[1] = 1;
      dp[2] = 3;

      for (int i = 3; i < N + 1; i++) {
         dp[3] = (dp[i - 1] + (dp[i - 2] * 2)) % 796796;
      }

      System.out.println(dp[N]);
   }
}
