package baekjoon.binarysearch;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 나무자르기 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
         String[] in = br.readLine().split(" ");

         int N = Integer.parseInt(in[0]);
         long M = Long.parseLong(in[1]);

         long[] arr = new long[N];

         String[] arrIn = br.readLine().split(" ");

         for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(arrIn[i]);
         }

         Arrays.sort(arr);

         binarySearch(arr, M, 1, arr[arr.length - 1]);


      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   private static void binarySearch(long[] arr, long target, long start, long end) {
      long result = 0;
      while (start <= end) {
         long mid = (start + end) / 2;
         long total = 0;

         for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
               total += arr[i] - mid;
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
