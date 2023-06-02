package inflean.chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class 가위바위보 {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int n = Integer.parseInt(in.nextLine());
      int[] A = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] B = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      String[] result = new String[n];

      for (int i = 0; i < n; i++) {
         result[i] = checkResult(A[i], B[i]);
      }

      for (String s : result) {
         System.out.println(s);
      }
      return ;
   }

   private static String checkResult(int a, int b) {
      if (a == b) {
         return "D";
      }

      if (a == 1) {
         if (b == 2) {
            return "B";
         }

         if (b == 3) {
            return "A";
         }
      }

      if (a == 2){
         if (b == 1) {
            return "A";
         }

         if (b == 3) {
            return "B";
         }
      }

      if (a == 3) {
         if (b == 1) {
            return "B";
         }

         if (b == 2) {
            return "A";
         }
      }

      return null;
   }
}
