package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 배 {
   static int result;
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int n = Integer.parseInt(br.readLine());
      String[] strs = br.readLine().split(" ");
      int m = Integer.parseInt(br.readLine());
      String[] brs = br.readLine().split(" ");
      List<Integer> arr = new ArrayList<>();
      List<Integer> box = new ArrayList<>();

      result = 0;

      for (int i = 0; i < n; i++) {
         arr.add(Integer.parseInt(strs[i]));
      }

      for (int i = 0; i < m; i++) {
         box.add(Integer.parseInt(brs[i]));
      }

      Collections.sort(arr, Collections.reverseOrder());
      Collections.sort(box, Collections.reverseOrder());

      if (arr.get(0) < box.get(0)) {
         bw.write(-1 + "\n");
         bw.close();
         br.close();
         return;
      }
      
      while (!box.isEmpty()) {
         int boxIdx = 0;
         int craneIdx = 0;

         while (craneIdx < n) {
            if (boxIdx == box.size()) {
               break;
            }
//            System.out.println(arr.get(craneIdx) + " : " + box.get(boxIdx));
            if (arr.get(craneIdx) >= box.get(boxIdx)) {
               box.remove(boxIdx);
               craneIdx++;

            } else {
               boxIdx++;
            }
         }
         result++;
      }

      bw.write(result + "\n");
      bw.flush();
      bw.close();
      br.close();
   }
}
