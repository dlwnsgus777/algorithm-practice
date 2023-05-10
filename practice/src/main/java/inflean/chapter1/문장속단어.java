package inflean.chapter1;

import java.util.Scanner;

public class 문장속단어 {
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      String[] input = in.nextLine().split(" ");
      int tempLength = Integer.MIN_VALUE;
      String result = "";
      for (String word : input) {
         if (tempLength <= word.length()) {
            tempLength = word.length();
            result = word;
         }
      }

      System.out.println(result);
      return ;
   }
}
