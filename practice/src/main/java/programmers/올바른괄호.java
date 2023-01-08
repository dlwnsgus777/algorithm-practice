package programmers;

import java.util.Stack;

public class 올바른괄호 {
   public static void main(String[] args) {
      System.out.println(solution("(()("));
   }

   public static boolean solution(String s) {
      boolean answer = true;
      Stack<Character> stack = new Stack<>();

      for (int i = 0; i < s.length(); i++) {
         if (!stack.isEmpty() && s.charAt(i) == ')') {
            stack.pop();
         } else if (s.charAt(i) == '(') {
            stack.push(s.charAt(i));
         } else {
            answer = false;
            break;
         }
      }

      if (!stack.isEmpty()) {
         answer = false;
      }

      return answer;
   }
}
