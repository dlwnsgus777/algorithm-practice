package programmers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class 프린터 {
   public static void main(String[] args) {
      System.out.println(solution(new int[] {2, 1, 3, 2}, 2));
//      System.out.println(solution(new int[] {1, 1, 9, 1, 1, 1}, 0));
   }

   static class Print {
      private final int impotant;
      private final int index;

      public Print(int impotant, int index) {
         this.impotant = impotant;
         this.index = index;
      }

      public int getImpotant() {
         return impotant;
      }

      public int getIndex() {
         return index;
      }
   }
   public static int solution(int[] priorities, int location) {
      Queue<Print> que = new LinkedList<>();
      Map<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < priorities.length; i++) {
         Print print = new Print(priorities[i], i);
         que.add(print);
         map.put(i, priorities[i]);
      }

      int answer = 0;

      while (!que.isEmpty()) {
         Print get = que.poll();
         boolean change = false;

         // key: 인덱스, value: 중요도
         for (Integer index : map.keySet()) {
            if (index != get.getIndex() && map.get(index) > get.getImpotant()) {
               change = true;
            }
         }
//         for (Print print : list) {
//            if (get.index != print.index && get.impotant < print.impotant) {
//               change = true;
//               break;
//            }
//         }

         if (change) {
            que.add(get);
         } else {
//            System.out.println(get.getIndex());
//            list.remove(get.index);
            map.remove(get.getIndex());
            answer++;

            if (get.getIndex() == location) {
               break;
            }
         }
      }

      return answer;
   }
}
