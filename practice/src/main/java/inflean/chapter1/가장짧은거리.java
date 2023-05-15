package inflean.chapter1;

import java.util.Scanner;

public class 가장짧은거리 {
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      String s = in.next();
      char t = in.next().charAt(0);
      int[] result = new int[s.length()];
      int p = 1000;

      for (int i = 0; i < s.length(); i++) {
         if (s.charAt(i) == t) {
            p = 0;
            result[i] = p;
         } else {
            p++;
            result[i] = p;
         }
      }

      for (int i = s.length() - 1; i >= 0; i--) {
         if (s.charAt(i) == t) {
            p = 0;
         } else {
            p++;
            result[i] = Math.min(result[i], p);
         }
      }

      for (int i : result) {
         System.out.print(i + " ");
      }
      return ;
   }
}
