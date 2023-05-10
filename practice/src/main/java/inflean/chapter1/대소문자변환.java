package inflean.chapter1;

import java.util.Scanner;

public class 대소문자변환 {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String input = in.nextLine();
      StringBuffer sb = new StringBuffer();
      for (int i = 0; i < input.length(); i++) {
         if (Character.isLowerCase(input.charAt(i))) {
            sb.append(Character.toUpperCase(input.charAt(i)));
         } else {
            sb.append(Character.toLowerCase(input.charAt(i)));
         }
      }

      System.out.println(sb);
      return ;
   }
}
