package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class 카드합체놀이 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   public static void main(String[] args) throws IOException {
      String[] arr = br.readLine().split(" ");
      String[] card = br.readLine().split(" ");

      List<Long> list = Arrays.stream(card).map(Long::parseLong).collect(Collectors.toList());

      Collections.sort(list);

      int m = Integer.parseInt(arr[1]);

      long result = 0;

      for (int i = 0; i < m; i++) {
         long a = list.get(0);
         long b = list.get(1);

         long plus = a + b;

         list.set(0, plus);
         list.set(1, plus);

         Collections.sort(list);
      }

      for (Long aLong : list) {
         result += aLong;
      }

      // System.out.println(list.stream().mapToLong(Long::intValue).sum()); => 이부분이 문제였던것 같음

      System.out.println(result);

      // 우선순위 큐
//      long n = Long.parseLong(arr[0]);
//      long m = Long.parseLong(arr[1]);
//
//      PriorityQueue<Long> queue = new PriorityQueue<>();
//
//      for (int i = 0; i < n; i++) {
//         queue.offer(Long.parseLong(card[i]));
//      }
//
//      for (int i = 0; i < m; i++) {
//         long a = queue.poll();
//         long b = queue.poll();
//
//         queue.offer(a + b);
//         queue.offer(a + b);
//      }
//
//      long result = 0;
//
//      for (int i = 0; i < n; i++) {
//         result += queue.poll();
//      }
//
//      System.out.println(result);


//      String[] card = br.readLine().split(" ");
//

   }
}
