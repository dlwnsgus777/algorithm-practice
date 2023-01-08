package dongbinbook.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 개미전사 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());
      String[] in = br.readLine().split(" ");
      int[] map = new int[in.length];
      int[] dp = new int[N];

      for (int i = 0; i < in.length; i++) {
         int number = Integer.parseInt(in[i]);

         map[i] = number;
      }

      dp[0] = map[0];
      dp[1] = Math.max(map[0], map[1]);

      for (int i = 2; i < N; i++) {
         dp[i] = Math.max(dp[i - 1], dp[i - 2] + map[i]);
      }

      System.out.println(dp[N - 1]);

   }
}
