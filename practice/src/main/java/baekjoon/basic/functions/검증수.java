package baekjoon.basic.functions;

import java.util.Scanner;

public class 검증수 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int result = 0;

      for (int i = 0; i < 5; i++) {
         int number = sc.nextInt();

         result = result + (number * number);
      }

      System.out.println(result % 10);

      sc.close();
   }
}
