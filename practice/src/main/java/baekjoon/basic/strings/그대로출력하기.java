package baekjoon.basic.strings;

import java.util.Scanner;

public class 그대로출력하기 {
   public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)) {

         while (sc.hasNext()) {
            System.out.println(sc.nextLine());
         }
      }
   }
}
