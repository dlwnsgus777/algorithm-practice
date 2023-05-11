package inflean.chapter1;

import java.util.Scanner;

public class 특정문자뒤집기 {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      char[] chars = in.nextLine().toCharArray();
      int lt = 0;
      int rt = chars.length - 1;

      while (lt < rt) {
         if (!Character.isAlphabetic(chars[lt])) lt++;
         else if (!Character.isAlphabetic(chars[rt])) rt--;
         else {
            char temp = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = temp;
            lt++;
            rt--;
         }
      }

      for (char aChar : chars) {
         System.out.print(aChar);
      }
      return ;
   }
}
