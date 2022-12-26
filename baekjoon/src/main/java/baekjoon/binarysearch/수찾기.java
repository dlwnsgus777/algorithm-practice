package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 수찾기 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

         int N = Integer.parseInt(br.readLine());

         String[] in = br.readLine().split(" ");

         int[] n = new int[N];

         for (int i = 0; i < N; i++) {
            n[i] = Integer.parseInt(in[i]);
         }

         int M = Integer.parseInt(br.readLine());

         String[] targets = br.readLine().split(" ");

         Arrays.sort(n);

         for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(targets[i]);

            bw.write(binarySearch(n, target, 0, N - 1) + "\n");
         }


         bw.flush();

      } catch (IOException e) {
         e.printStackTrace();
      }

   }

   private static int binarySearch(int[] arr, int target, int start, int end) {
      int result = 0;
      while (start <= end) {
         int mid = (start + end) / 2;

         if (arr[mid] == target) {
            result = 1;
            break;
         }

         if (arr[mid] > target) {
            end = mid - 1;
         } else {
            start = mid + 1;
         }
      }

      return result;
   }
}
