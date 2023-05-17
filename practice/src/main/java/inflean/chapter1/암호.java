package inflean.chapter1;

import java.util.Scanner;

public class 암호 {
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      int input1 = Integer.parseInt(in.nextLine());
      String str = in.nextLine();
      String result = "";

      for (int i = 0; i < input1; i++) {
         String st = str.substring(0, 7).replace("#", "1").replace("*", "0");
         str = str.substring(7);

         result += (char) Integer.parseInt(st, 2);
      }


      System.out.println(result);
      return ;
   }
}
