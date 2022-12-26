package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 랜선자르기 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
         String[] arr = br.readLine().split(" ");

         int N = Integer.parseInt(arr[0]);
         long K = Long.parseLong(arr[1]);

         long[] lan = new long[N];

         for (int i = 0; i < N; i++) {
            lan[i] = Long.parseLong(br.readLine());
         }

         Arrays.sort(lan);

         binarySearch(lan, K, 1, lan[lan.length - 1]);

      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   private static void binarySearch(long[] arr, long target, long start, long end) {
      long result = 0;
      while (start <= end) {
         long mid = (start + end) / 2;
         int total = 0;

         for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= mid) {
               total += arr[i] / mid;
            }
         }

         if (total < target) {
            end = mid - 1;
         } else {
            result = mid;
            start = mid + 1;
         }
      }

      System.out.println(result);
   }
}
