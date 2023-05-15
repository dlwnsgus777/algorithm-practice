package inflean.chapter1;

import java.util.Scanner;

public class 문자열압축 {
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      char[] chars = in.nextLine().toCharArray();
      char target;
      int count;
      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < chars.length; i++) {
         target = chars[i];
         sb.append(target);
         count = 1;
         for (int j = i + 1; j < chars.length; j++) {
            if (target == chars[j]) {
               count++;
            } else {
               break;
            }
         }

         if (count > 1) {
            sb.append(count);
            i += count - 1;
         }
      }

      System.out.println(sb.toString());

      return ;
   }
}
