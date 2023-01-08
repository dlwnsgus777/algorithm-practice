package programmers;

import java.util.ArrayList;

public class 비밀지도 {

   public static void main(String[] args) {
      solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10});
   }

   public static String[] solution(int n, int[] arr1, int[] arr2) {
      String[] answer = new String[n];

      String[] arr1ToString = new String[arr1.length];
      String[] arr2ToString = new String[arr2.length];

      for (int i = 0; i < n; i++) {
         String str1 = Integer.toBinaryString(arr1[i]);
         String str2 = Integer.toBinaryString(arr2[i]);

         if (str1.length() != n) {
            str1 = "0".repeat(n - str1.length())+ str1;
         }

         if (str2.length() != n) {
            str2 = "0".repeat(n - str2.length()) + str2;
         }

         arr1ToString[i] = str1;
         arr2ToString[i] = str2;
      }

      for (int i = 0; i < n; i++) {
         String row = arr1ToString[i];
         String row2 = arr2ToString[i];
         StringBuilder result = new StringBuilder();

         for (int j = 0; j < n; j++) {
            char a = row.charAt(j);
            char b = row2.charAt(j);

            if (a == b) { // 공백 및 벽
               if (a == '0') {
                  result.append(" ");
               } else {
                  result.append("#");
               }
            } else {
               result.append("#");
            }
         }
         answer[i] = result.toString();
      }

      for (int i = 0; i < answer.length; i++) {
         System.out.println(answer[i]);
      }


      return answer;
   }
}
