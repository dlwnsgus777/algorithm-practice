package baekjoon.basic.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 팩토리얼0의개수 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());

      if (N < 2) {
         System.out.println(0);
         System.exit(0);
      }

      BigInteger[] factor = new BigInteger[N + 1];
      
      factor[1] = BigInteger.valueOf(1);
      factor[2] = BigInteger.valueOf(1);

      for (int i = 2; i < factor.length; i++) {
         factor[i] = factor[i - 1].multiply(BigInteger.valueOf(i));
      }

      int count = 0;

      char[] arr = String.valueOf(factor[N]).toCharArray();

      for(int i = arr.length - 1; i >= 0; i--) {
         if (arr[i] == '0') {
            count++;
         } else {
            break;
         }
      }

      System.out.println(count);
   }
}
