package baekjoon.basic.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이항계수 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
         String[] NK = br.readLine().split(" ");
         int N = Integer.parseInt(NK[0]);
         int K = Integer.parseInt(NK[1]);

         System.out.println(solution(N, K));

      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   private static int solution(int n, int k) {
      if (k == 0 || n == k) {
         return 1;
      }

      return solution(n - 1, k) + solution(n - 1, k - 1);
   }
}
