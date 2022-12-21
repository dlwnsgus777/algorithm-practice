package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 프린터큐 {
   static class Print {
      private final int number;
      private final int impo;

      public Print(int number, int impo) {
         this.number = number;
         this.impo = impo;
      }

      public int getNumber() {
         return number;
      }

      public int getImpo() {
         return impo;
      }

   }

   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

         int CASE = Integer.parseInt(br.readLine());

         while (CASE > 0) {
            String[] input = br.readLine().split(" ");
            Queue<Print> que = new LinkedList<>();

            int N = Integer.parseInt(input[0]);
            int target = Integer.parseInt(input[1]);
            List<Integer> impoArr = new ArrayList<>();

            String[] arr = br.readLine().split(" ");

            // 입력
            for (int i = 0; i < N; i++) {
               impoArr.add(Integer.parseInt(arr[i]));
               que.add(new Print(i, Integer.parseInt(arr[i])));
            }

            // 정렬
            Collections.sort(impoArr, Collections.reverseOrder());

            int count = 0;

            while (!que.isEmpty()) {
               Print point = que.poll();

               int max = impoArr.get(0);

               if (max > point.getImpo()) {
                  que.offer(point);
               } else {
                  impoArr.remove(0);
                  count++;
                  if (point.getNumber() == target) {
                     break;
                  }
               }
            }


            bw.write(count + "\n");

            CASE--;
         }

         bw.flush();

      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
