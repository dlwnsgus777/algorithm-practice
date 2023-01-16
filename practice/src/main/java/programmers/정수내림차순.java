package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class 정수내림차순 {
   public static void main(String[] args) {
      System.out.println(solution(118372L));
   }

   public static long solution(long n) {
      String[] arr = String.valueOf(n).split("");

      Arrays.sort(arr, Collections.reverseOrder());



      return Long.parseLong(Arrays.stream(arr).collect(Collectors.joining()));
   }
}
