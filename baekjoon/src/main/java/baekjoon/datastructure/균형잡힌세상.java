package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 균형잡힌세상 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
         String N = br.readLine();

         while (!N.equals(".")) {
            char[] arr = N.toCharArray();
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < arr.length; i++) {
               if (arr[i] == '(' || arr[i] == '[') {
                  stack.push(arr[i]);
               } else if (arr[i] == ')') {
                  if (!stack.isEmpty()) {
                     char k = stack.peek();

                     if (k == '(') {
                        stack.pop();
                     } else {
                        break;
                     }
                  } else {
                     stack.push('F');
                     break;
                  }
               } else if (arr[i] == ']') {
                  if (!stack.isEmpty()) {
                     char k = stack.peek();

                     if (k == '[') {
                        stack.pop();
                     } else {
                        break;
                     }
                  } else {
                     stack.push('F');
                     break;
                  }
               }
            }

            if (stack.isEmpty()) {
               bw.write("yes\n");
            } else {
               bw.write("no\n");
            }

            N = br.readLine();
         }

         bw.flush();
      } catch (IOException e) {
         e.printStackTrace();;
      }
   }
}
