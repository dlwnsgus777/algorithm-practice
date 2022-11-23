package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거스름돈 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   public static void main(String[] args) throws IOException {
      int[] an = {500, 100, 50, 10, 5, 1};
      int result = 0;
      int money = 1000 - Integer.parseInt(br.readLine());

      for (int i = 0; i < an.length; i++) {
         if (money < an[i]) {
            continue;
         }
         result += money / an[i];
         money %= an[i];

      }

      System.out.println(result);
      br.close();
   }
}
