package inflean.chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 중복문자제거 {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      char[] chars = in.nextLine().toCharArray();
      List<Character> result = new ArrayList<>();

      for (int i = 0; i < chars.length; i++) {
         char target = chars[i];
         if (!result.contains(target)) {
            result.add(target);
         }
      }

      for (Character character : result) {
         System.out.print(character);
      }

      // 다른 풀이
//      String answer = "";
//      String str = in.nextLine();
//      for (int i = 0; i < str.length(); i++) {
//         if (str.indexOf(str.charAt(i)) == i) {
//            answer += str.charAt(i);
//         }
//      }
//      System.out.println(answer);

      return ;
   }
}
