package inflean.chapter2;

import java.util.Scanner;

public class 보이는학생 {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = in.nextInt();
      }

      int result = 1;
      int taller = arr[0];
      for (int i = 1; i < n; i++) {
         if (arr[i] > taller) {
            taller = arr[i];
            result++;
         }
      }

      System.out.println(result);
      return ;
   }
}
