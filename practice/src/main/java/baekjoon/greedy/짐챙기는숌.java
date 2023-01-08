package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 짐챙기는숌 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   public static void main(String[] args) throws IOException {
      String[] arr = br.readLine().split(" ");

      int n = Integer.parseInt(arr[0]);
      int m = Integer.parseInt(arr[1]);
      int result = 1;
      int box = m;

      if (n == 0) {
         System.out.println(0);
         return;
      }

      String[] books = br.readLine().split(" ");

      for (int i = 0; i < books.length; i++) {
         int b = Integer.parseInt(books[i]);

         if (box - b < 0) {
            box = m;
            result++;
         }
            box -= b;
      }

      System.out.println(result);
   }
}
