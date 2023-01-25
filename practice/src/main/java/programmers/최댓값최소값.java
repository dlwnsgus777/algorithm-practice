package programmers;

public class 최댓값최소값 {
   public static void main(String[] args) {
      System.out.println(solution("-1 -2 -3 -4"));
   }

   public static String solution(String s) {
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      String[] arr = s.split(" ");

      for (String s1 : arr) {
         int value = Integer.parseInt(s1);
         if (max < value) {
            max = value;
         }

         if (min >= value) {
            min = value;
         }
      }

      return min + " " + max;
   }
}
