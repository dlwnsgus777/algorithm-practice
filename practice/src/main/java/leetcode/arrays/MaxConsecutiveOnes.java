package leetcode.arrays;

import java.util.Map;

public class MaxConsecutiveOnes {
   public static void main(String[] args) {
      System.out.println(findMaxConsecutiveOnes(new int[] {1,1,0}));
   }

   public static int findMaxConsecutiveOnes(int[] nums) {
      int answer = 0;
      int count = 0;

      for (int i = 0; i < nums.length; i++) {
         if (nums[i] == 1) {
            count++;
         } else {
            count = 0;
         }
         answer = Math.max(answer, count);
      }

      return answer;
   }
}
