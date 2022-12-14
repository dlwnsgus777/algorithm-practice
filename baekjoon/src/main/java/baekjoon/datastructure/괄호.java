package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
         int n = Integer.parseInt(br.readLine());

         while (n != 0) {
            Stack<String> stack = new Stack<>();
            String[] arr = br.readLine().split("");

            for (int i = 0; i < arr.length; i++) {
               if (arr[i].equals("(")) {
                  stack.push(arr[i]);
               } else {
                  int size = stack.size();

                  if (size == 0) {
                     stack.push(arr[i]);
                     break;
                  } else {
                     stack.pop();
                  }
               }
            }

            if (stack.isEmpty()) {
               System.out.println("YES");
            } else {
               System.out.println("NO");
            }
            n--;
         }

      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
