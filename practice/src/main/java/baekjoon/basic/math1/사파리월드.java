package baekjoon.basic.math1;

import java.util.Scanner;

public class 사파리월드 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      long a = sc.nextLong();
      long b = sc.nextLong();

      System.out.println(Math.abs(a - b));

      sc.close();
   }
}
