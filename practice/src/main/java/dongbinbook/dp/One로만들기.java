package dongbinbook.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One로만들기 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());
      int[] result = new int[N + 1];

      for (int i = 2; i < result.length; i++) {
         result[i] = result[i - 1] + 1;

         if (i % 2 == 0) {
            result[i] = Math.min(result[i], result[i / 2] + 1);
         }

         if (i % 3 == 0) {
            result[i] = Math.min(result[i], result[i / 3] + 1);
         }

         if (i % 5 == 0) {
            result[i] = Math.min(result[i], result[i / 5] + 1);
         }
      }

      System.out.println(result[N]);
   }
}
