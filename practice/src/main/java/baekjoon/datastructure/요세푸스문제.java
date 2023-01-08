package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class 요세푸스문제 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {
      String[] nk = br.readLine().split(" ");
      Queue<Integer> que = new LinkedList<>();

      int n = Integer.parseInt(nk[0]);
      int k = Integer.parseInt(nk[1]);
      int count = 1;

      for (int i = 1; i <= n; i++) {
         que.add(i);
      }

      bw.write("<");

//      while(!que.isEmpty()) {
//         if (count == k) {
//            int number = que.poll();
//            bw.write(number + ", ");
//            count = 1;
//         }
//
//         if (que.size() == 1) {
//            bw.write(que.poll() + ">");
//            break;
//         }
//
//         if (que.isEmpty()) {
//            break;
//         }
//
//         int number = que.poll();
//         que.offer(number);
//         count++;
//      }

      while (que.size() > 1) {
         for (int i = 0; i < k - 1; i++) {
            que.offer(que.poll());
         }
         bw.write(que.poll() + ", ");
      }

      bw.write(que.poll() + ">");

      bw.flush();
      bw.close();
      br.close();
   }
}
