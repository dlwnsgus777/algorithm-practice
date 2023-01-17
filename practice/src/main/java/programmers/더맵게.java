package programmers;

import java.util.PriorityQueue;

public class 더맵게 {
   public static void main(String[] args) {
      System.out.println(solution(new int[] {1, 2, 3, 9, 10, 12}, 7));
   }

   public static int solution(int[] scoville, int K) {
      PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
      int answer = 0;

      for (int i : scoville) {
         priorityQueue.add(i);
      }

      while (priorityQueue.size() >= 1) {
         int scovil = priorityQueue.poll();

         if (scovil >= K) {
            break;
         }

         if (priorityQueue.size() < 1) {
            break;
         }

         int second = priorityQueue.poll();

         int newScovil = scovil + (second * 2);

         answer++;

         priorityQueue.add(newScovil);
      }

      return answer;
   }

}
