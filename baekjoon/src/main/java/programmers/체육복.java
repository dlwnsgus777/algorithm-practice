package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 체육복 {
   public static void main(String[] args) {
      System.out.println(solution(3, new int[] {1, 2}, new int[] {2, 3}));
   }

   public static int solution(int n, int[] lost, int[] reserve) {
      Arrays.sort(lost);
      Arrays.sort(reserve);
      List<Integer> list = new ArrayList<>();
      List<Integer> resers = new ArrayList<>();

      for (int i = 0; i < reserve.length; i++) {

         for (int j = 0; j < lost.length; j++) {
            if (lost[j] == 31) {
               continue;
            }

            if (lost[j] == reserve[i]) {
               lost[j] = 31;
               reserve[i] = 31;
            }
         }
      }

      for (int i = 0; i < reserve.length; i++) {
         if (reserve[i] != 31) {
            resers.add(reserve[i]);
         }
      }

      for (int i = 0; i < lost.length; i++) {
         if (lost[i] != 31) {
            list.add(lost[i]);
         }
      }

      for (int number : resers) {
         for (int j = 0; j < list.size(); j++) {

            if (number - 1 == list.get(j) || number + 1 == list.get(j) || number == list.get(j)) {
               list.remove(j);
               break;
            }
         }
      }

      int answer = n - list.size();
      return answer;
   }
}
