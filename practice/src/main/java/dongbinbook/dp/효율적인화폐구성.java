package dongbinbook.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 효율적인화폐구성 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String[] inFirst = br.readLine().split(" ");

      int N = Integer.parseInt(inFirst[0]);
      int M = Integer.parseInt(inFirst[1]);
      int[] arr = new int[N];
      int[] dp = new int[M + 1];

      for (int i = 0; i < N; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      Arrays.fill(dp, 10001);

      dp[0] = 0;


      for (int i = 0; i < N; i++) {
         for (int j = arr[i]; j < M + 1; j++) {
            if (dp[j - arr[i]] != 10001) {
               dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
            }
         }
      }

      System.out.println(dp[M]);
   }
}
