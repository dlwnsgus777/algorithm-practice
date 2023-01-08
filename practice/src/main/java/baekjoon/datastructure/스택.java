package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 스택 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
         int N = Integer.parseInt(br.readLine());
         Stack<String> stack = new Stack<>();

         while (N != 0) {
            String[] arr = br.readLine().split(" ");

            if (arr.length > 1) {
               stack.push(arr[1]);
               N--;
               continue;
            }

            switch (arr[0]) {
               case "top" :
                  if (stack.isEmpty()) {
                     bw.write("-1\n");
                     break;
                  }
                  bw.write(stack.peek() + "\n");
                  break;
               case "size" :
                  bw.write(stack.size() + "\n");
                  break;
               case "empty" :
                  if (stack.isEmpty()) {
                     bw.write("1\n");
                     break;
                  }
                  bw.write("0\n");
                  break;
               case "pop" :
                  if (stack.isEmpty()) {
                     bw.write("-1\n");
                     break;
                  }
                  bw.write(stack.pop() + "\n");
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
