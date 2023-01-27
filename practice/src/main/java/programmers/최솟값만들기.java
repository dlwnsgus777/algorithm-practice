package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class 최솟값만들기 {
   public static void main(String[] args) {
      System.out.println(solution(new int[] {1, 4, 2}, new int[] {5, 4, 4}));
   }
   public static int solution(int[] A, int[] B) {
      int answer = 0;

      PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
      PriorityQueue<Integer> rev = new PriorityQueue<>(Collections.reverseOrder());

      for (int i = 0; i < A.length; i++) {
         priorityQueue.add(A[i]);
         rev.add(B[i]);
      }

      while (!rev.isEmpty()) {
         answer += priorityQueue.poll() * rev.poll();
      }

      return answer;
   }
}
