package programmers;

import java.util.HashSet;
import java.util.Set;

public class 포켓몬 {

   class Solution {
      public int solution(int[] nums) {
         Set<Integer> set = new HashSet<>();
         int getPok = nums.length / 2;

         for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
         }

         return set.size() > getPok ? getPok : set.size();
      }
   }
}
