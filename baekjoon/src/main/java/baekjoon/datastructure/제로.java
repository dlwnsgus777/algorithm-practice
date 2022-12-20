package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
         int N = Integer.parseInt(br.readLine());
         Stack<Integer> stack = new Stack<>();

         while(N > 0) {
            int number = Integer.parseInt(br.readLine());

            N--;

            if (number == 0) {
               stack.pop();
               continue;
            }

            stack.push(number);
         }

         System.out.println(stack.stream().mapToInt(i -> i).sum());

      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
