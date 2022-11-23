package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 잃어버린괄호 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   public static void main(String[] args) throws IOException {
      String[] arr = br.readLine().split("-");
      int result = 0;

      for (int i = 0; i < arr.length; i++) {
         String[] tt = arr[i].split("\\+");
         int sum = 0;


         if (tt.length > 1) {
            for (int j = 0; j < tt.length; j++) {
               sum += Integer.parseInt(tt[j]);
            }
         } else {
            sum = Integer.parseInt(tt[0]);
         }

         if (result == 0) {
            result = sum;
         } else {
            result -= sum;
         }
      }

      System.out.println(result);
      br.close();
   }
}
