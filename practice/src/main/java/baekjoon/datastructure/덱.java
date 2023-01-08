package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class 덱 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
         int N = Integer.parseInt(br.readLine());
         Deque<String> que = new LinkedList<>();

         while (N != 0) {
            String[] arr = br.readLine().split(" ");

            if (arr.length > 1) {
               if (arr[0].equals("push_back")) {
                  que.addLast(arr[1]);
               } else {
                  que.addFirst(arr[1]);
               }
               N--;
               continue;
            }

            switch (arr[0]) {
               case "pop_front" :
                  if (que.isEmpty()) {
                     bw.write("-1\n");
                     break;
                  }
                  bw.write(que.removeFirst() + "\n");
                  break;
               case "pop_back" :
                  if (que.isEmpty()) {
                     bw.write("-1\n");
                     break;
                  }
                  bw.write(que.removeLast() + "\n");
                  break;
               case "size" :
                  bw.write(que.size() + "\n");
                  break;
               case "empty" :
                  if (que.isEmpty()) {
                     bw.write("1\n");
                     break;
                  }
                  bw.write("0\n");
                  break;
               case "front" :
                  if (que.isEmpty()) {
                     bw.write("-1\n");
                     break;
                  }
                  bw.write(que.getFirst() + "\n");
                  break;
               case "back" :
                  if (que.isEmpty()) {
                     bw.write("-1\n");
                     break;
                  }
                  bw.write(que.getLast() + "\n");
                  break;
            }

            N--;
         }

         bw.flush();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
