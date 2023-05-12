package inflean.chapter1;

import java.util.Scanner;

public class 유효한팰린드롬 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine().toUpperCase();
      str = str.replaceAll("[^A-Z]", "");
      String target = new StringBuilder(str).reverse().toString();
      if (target.equals(str)) {
         System.out.println("YES");
      } else {
         System.out.println("NO");
      }

      return ;
   }
}
