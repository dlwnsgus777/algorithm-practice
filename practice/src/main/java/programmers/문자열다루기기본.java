package programmers;

public class 문자열다루기기본 {
   public static void main(String[] args) {
      System.out.println(solution("1234"));
   }

   public static boolean solution(String s) {
      boolean answer = true;

      if (s.length() != 4 && s.length() != 6) {
         answer = false;
      }

      if (s == null || s.equals("")) {
         answer = false;
      }

      if (!s.chars().allMatch(Character::isDigit)) {
         answer = false;
      }
      return answer;
   }
}
