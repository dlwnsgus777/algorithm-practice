package inflean.chapter1;

import java.util.Scanner;

import static baekjoon.datastructure.스택수열.br;

public class 단어뒤집기 {
   public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int number = in.nextInt();
      String[] arr = new String[number];
      for (int i = 0; i < number; i++) {
         arr[i] = in.next();
      }

      for (String s : arr) {
         String answer = new StringBuilder(s).reverse().toString();
         System.out.println(answer);
      }

      return ;
   }
}
