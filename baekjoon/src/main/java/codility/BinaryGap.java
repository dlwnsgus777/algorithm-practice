package codility;

public class BinaryGap {
   public static void main(String[] args) {
      System.out.println(solution(1041));
   }

   public static int solution(int N) {
      char[] arr = Integer.toBinaryString(N).toCharArray();
      char number = '1';
      int result = 0;
      int count = 0;

      for (int i = 1; i < arr.length; i++) {
         if (number == arr[i]) {
            result = Math.max(result, count);
            count = 0;
         } else {
            count++;
         }
      }

      return result;
      // Implement your solution here
   }
}
