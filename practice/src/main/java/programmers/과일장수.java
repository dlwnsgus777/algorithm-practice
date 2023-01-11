package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 과일장수 {
   public static void main(String[] args) {
      System.out.println(solution(3, 4, new int[] {1, 2, 3, 1, 2, 3, 1}));
   }

   public static int solution(int k, int m, int[] score) {
      int answer = 0;

      List<Integer> list = new ArrayList<>();

      for (int i : score) {
         list.add(i);
      }
      int cursor = m - 1;

      Collections.sort(list, Collections.reverseOrder());

      while (cursor < list.size()) {
         System.out.println(cursor);
         answer += list.get(cursor) * m;
         cursor += m;
      }

      return answer;
   }
}
