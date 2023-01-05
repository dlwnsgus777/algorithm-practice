package leetcode.arrays;

public class FindNumberswithEvenNumberofDigits {

   public static void main(String[] args) {
      findNumbers(new int[] {555,901,482,1771});
   }

   public static int findNumbers(int[] nums) {
      int answer = 0;

      for (int i = 0; i < nums.length; i++) {
         String number = String.valueOf(nums[i]);

         if (number.length() % 2 == 0) {
            answer++;
         }
      }

      System.out.println(answer);

      return answer;
   }
}
