package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class 큐 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
         int N = Integer.parseInt(br.readLine());
         Queue<String> que = new LinkedList<>();
         String last = "-1";

         while (N != 0) {
            String[] arr = br.readLine().split(" ");


            if (arr.length > 1) {
               last = arr[1];
               que.offer(last);
               N--;
               continue;
            }

            switch (arr[0]) {
               case "front" :
                  if (que.isEmpty()) {
                     bw.write("-1\n");
                     break;
                  }
                  bw.write(que.peek() + "\n");
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
               case "pop" :
                  if (que.isEmpty()) {
                     bw.write("-1\n");
                     break;
                  }
                  bw.write(que.poll() + "\n");
                  break;
               case "back" :
                  if (que.isEmpty()) {
                     bw.write("-1\n");
                     break;
                  }
                  bw.write(last + "\n");
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
