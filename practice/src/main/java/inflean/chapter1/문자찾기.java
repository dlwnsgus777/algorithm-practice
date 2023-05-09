package inflean.chapter1;

import java.util.Scanner;

public class 문자찾기 {
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      String[] input1 = in.nextLine().split("");
      String input2 = in.nextLine().toLowerCase();
      int result = 0;

      for (int i = 0; i < input1.length; i++) {
         if (input1[i].toLowerCase().equals(input2)) {
            result++;
         }
      }

      System.out.println(result);
      return ;
   }
}
