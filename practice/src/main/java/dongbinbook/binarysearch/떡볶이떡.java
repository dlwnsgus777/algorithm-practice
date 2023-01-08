package dongbinbook.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 떡볶이떡 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
         String[] arr = br.readLine().split(" ");

         int N = Integer.parseInt(arr[0]);
         int target = Integer.parseInt(arr[1]);

         String[] in = br.readLine().split(" ");
         int[] duk = new int[N];

         for (int i = 0; i < N; i++) {
            duk[i] = Integer.parseInt(in[i]);
         }

         Arrays.sort(duk);

         binarySearch(duk, target, 0, duk[duk.length - 1]);

      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   private static void binarySearch(int[] arr, int target, int start, int end) {
      int result = 0;
      while (start <= end) {
         int mid = (start + end) / 2;
         int total = 0;

         for (int i = 0; i < arr.length; i++) {
            int a = arr[i];

            if (a >= mid) {
               total += a - mid;
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
