package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 음계 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
         String[] arr = br.readLine().split(" ");
         String result = arr[0].equals("1") ? "ascending" : "descending";

         for (int i = 1; i < 8; i++) {
            int first = Integer.parseInt(arr[i - 1]);
            int second = Integer.parseInt(arr[i]);

            if (first + 1 == second) {
               result = "ascending";
            } else if (second + 1 == first) {

               result = "descending";
            } else {
               result = "mixed";
               break;
            }
         }

         System.out.println(result);

      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
