package programmers;

import java.util.ArrayList;
import java.util.List;

public class 문자열내마음대로정렬하기 {
   public static void main(String[] args) {
      solution(new String[] {"abce", "abcd", "cdx"}, 2);
   }

   public static String[] solution(String[] strings, int n) {
      List<String> list = new ArrayList<>();

      for (String s: strings) {
         list.add(s);
      }

      list.sort((s1, s2) -> {
         if (s1.charAt(n) == s2.charAt(n)) {
            return s1.compareTo(s2);
         }

         return Character.compare(s1.charAt(n), s2.charAt(n));
      });


      String[] answer = list.toArray(String[]::new);

      return answer;
   }
}
