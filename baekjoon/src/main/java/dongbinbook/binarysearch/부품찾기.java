package dongbinbook.binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 부품찾기 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
         int N = Integer.parseInt(br.readLine());
         int[] store = new int[N];
         String[] in = br.readLine().split(" ");

         int M = Integer.parseInt(br.readLine());
         String[] cus = br.readLine().split(" ");

         for (int i = 0; i < N; i++) {
            store[i] = Integer.parseInt(in[i]);
         }

         Arrays.sort(store);

         for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(cus[i]);

            if (binarySearch(store, target, 0, N - 1)) {
               bw.write("yes ");
            } else {
               bw.write("no ");
            };
         }

         bw.flush();

      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   private static boolean binarySearch(int[] arr, int target, int start, int end) {
      boolean result = false;

      while (start <= end) {
         int mid = (start + end) / 2;

         if (arr[mid] == target) {
            result = true;
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
