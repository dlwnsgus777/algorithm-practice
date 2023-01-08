package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 풀이 참고 중
public class 계단오르기 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());

      int[] map = new int[301];
      int[] dp = new int[301];


      for (int i = 1; i < N + 1; i++) {
         map[i] = Integer.parseInt(br.readLine());
      }

      dp[0] = 0; // 시작
      dp[1] = map[1]; // 첫번째 칸
      dp[2] = map[1] + map[2];


      for (int i = 3; i < N + 1; i++) {
         dp[i] = Math.max(dp[i - 3] + map[i - 1], dp[i - 2]) + map[i];
      }

      System.out.println(dp[N]);

   }
}
