package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 풀이 참고 중
public class 계단오르기 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());

      int[] map = new int[N];
      int[] dp = new int[N];


      for (int i = 0; i < N; i++) {
         map[i] = Integer.parseInt(br.readLine());
      }



   }
}
