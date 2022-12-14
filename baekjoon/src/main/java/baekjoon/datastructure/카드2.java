package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
         int n = Integer.parseInt(br.readLine());
         Queue<Integer> que = new LinkedList<>();

         for (int i = 1; i <= n; i++) {
            que.offer(i);
         }

         while (que.size() != 1) {
            que.poll();

            que.offer(que.poll());
         }

         System.out.println(que.poll());


      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
