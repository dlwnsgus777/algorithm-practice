package baekjoon.basic.functions;

import java.util.Scanner;

public class 이상한기호 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      System.out.println((a+b)*(a-b));
   }
}
