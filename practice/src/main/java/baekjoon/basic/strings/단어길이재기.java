package baekjoon.basic.strings;

import java.util.Scanner;

public class 단어길이재기 {
   public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)) {
         String a = sc.next();

         System.out.println(a.length());
      }
   }
}
