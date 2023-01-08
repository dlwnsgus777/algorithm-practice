package programmers;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어 {
   public static void main(String[] args) {
      int[] arr = {1,1,3,3,0,1,1};
      System.out.println(solution(arr));
   }

   public static int[] solution(int []arr) {
      int[] answer = {};
      Stack<Integer> stack = new Stack<>();

      for (int i = 0; i < arr.length; i++) {
         if (!stack.isEmpty() && stack.peek() == arr[i]) {
            continue;
         }

         stack.push(arr[i]);
      }

      answer = new int[stack.size()];

      for (int i = stack.size() - 1; i >= 0; i--) {
         answer[i] = stack.pop();
      }

      for (int i = 0; i < answer.length; i++) {
         System.out.print(answer[i] + " ");
      }

      return answer;
   }
}
