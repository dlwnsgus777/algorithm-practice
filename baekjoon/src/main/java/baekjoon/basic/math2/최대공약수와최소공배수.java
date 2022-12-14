package baekjoon.basic.math2;

import java.util.Scanner;

public class 최대공약수와최소공배수 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();

      int gbc = gbc(a, b);
      int lcm = lcm(a, b);

      System.out.println(gbc);
      System.out.println(lcm);
   }

   private static int gbc(int a, int b) {
      if (a < b) {
         int temp = a;
         a = b;
         b = temp;
      }

      while(b != 0) {
         int r = a % b;
         a = b;
         b = r;
      }

      return a;
   }

   private static int lcm(int a, int b) {
      return a * b / gbc(a, b);
   }
}
