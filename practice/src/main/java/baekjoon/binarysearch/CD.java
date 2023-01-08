package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CD {
   static int result;
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

         String[] in = br.readLine().split(" ");

         int N = Integer.parseInt(in[0]);
         int M = Integer.parseInt(in[0]);

         while (N != 0 && M != 0) {
            result = 0;
            int[] sun = new int[N];

            for (int i = 0; i < N; i++) {
               sun[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < M; i++) {
               int target = Integer.parseInt(br.readLine());

               binarySearch(sun, target, 0, N - 1);
            }

            in = br.readLine().split(" ");

            N = Integer.parseInt(in[0]);
            M = Integer.parseInt(in[0]);

            bw.write(result + "\n");
         }


         bw.flush();

      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   private static void binarySearch(int[] arr, int target, int start, int end) {
      while (start <= end) {
         int mid = (start + end) / 2;

         if (arr[mid] == target) {
            result++;
            break;
         }

         if (arr[mid] > target) {
            end = mid - 1;
         } else {
            start = mid + 1;
         }
      }
   }
}
