package inflean.chapter2;

import java.util.Scanner;

public class 큰수출력하기 {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int[] arr = new int[num];
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < num; i++) {
         arr[i] = Integer.parseInt(in.next());

      }

      for (int i = 0; i < num; i++) {
         if (i == 0) {
            sb.append(arr[i]).append(" ");
            continue;
         }

         int target = arr[i];

         if (arr[i - 1] < target) {
            sb.append(target).append(" ");
         }
      }

      System.out.println(sb);
      return;
   }
}
