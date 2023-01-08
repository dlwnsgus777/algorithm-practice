package programmers;


public class 자릿수더하기 {
   public static void main(String[] args) {
      System.out.println(solution(987));
   }

   public static int solution(int n) {
      String[] str = String.valueOf(n).split("");
      int result = 0;


      for (int i = 0; i < str.length; i++) {
         result += Integer.parseInt(str[i]);
      }

      return result;
   }
}
