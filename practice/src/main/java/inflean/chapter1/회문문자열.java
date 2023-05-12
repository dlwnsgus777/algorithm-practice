package inflean.chapter1;

import java.util.Scanner;

public class 회문문자열 {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String str = in.nextLine().toLowerCase();
      String reverseStr = new StringBuilder(str).reverse().toString();

      if (str.equals(reverseStr)) {
         System.out.println("YES");
      } else {
         System.out.println("NO");
      }

      // 다른 풀이
      int len = str.length();

      for (int i = 0; i < len/2; i++) {
         if (str.charAt(i) != str.charAt(len - i - 1)) {
            System.out.println("NO");
            return;
         }
      }
      System.out.println("YES");

      return ;
   }
}
