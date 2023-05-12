package inflean.chapter1;

import java.util.Scanner;

public class 숫자만추출 {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      str = str.replaceAll("[a-z|A-Z]", "");
      System.out.println(Integer.parseInt(str));
      return ;
   }
}
