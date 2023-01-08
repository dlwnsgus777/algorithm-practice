package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {
   public static void main(String[] args) {
      int[] progress = {95, 90, 99, 99, 80, 99};
      int[] speeds = {1, 1, 1, 1, 1, 1};

      solution(progress, speeds);
   }

   public static int[] solution(int[] progresses, int[] speeds) {
      int[] works = new int[speeds.length];
      int[] answer = {};

      Queue<Integer> q = new LinkedList<>();

      for (int i = 0; i < works.length; i++) {
         if ((100 - progresses[i]) % speeds[i] == 0) {
            works[i] = (100 - progresses[i]) / speeds[i];
         } else {
            works[i] = ((100 - progresses[i]) / speeds[i]) + 1;
         }
         q.add(works[i]);
      }

      List<Integer> list = new ArrayList<>();

      int cnt = 1;
      int before = q.poll();
       while (!q.isEmpty()) {
          if (q.peek() <= before) {
             cnt++;
             q.poll();
          } else {
             list.add(cnt);
             cnt = 1;
             before = q.poll();
          }
       }

      list.add(cnt);

      answer = list.stream().mapToInt(s -> s).toArray();

      return answer;
   }
}
