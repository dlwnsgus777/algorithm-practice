package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수들의합 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   public static void main(String[] args) throws IOException {
      long s = Long.parseLong(br.readLine());
      int first = 1;
      int result = 0;

      while(s > 0) {
         if (s - first < 0) {
            break;
         }
         s -= first;
         result++;
         first++;
      }

      System.out.println(result);
   }
}
