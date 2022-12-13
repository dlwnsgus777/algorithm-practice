package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 탑 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

   private static class Top {
      private final int height;
      private final int number;

      public Top(int height, int number) {
         this.height = height;
         this.number = number;
      }

      public int getHeight() {
         return this.height;
      }

      public int getNumber() {
         return this.number;
      }
   }

   public static void main(String[] args) throws IOException {
      int n = Integer.parseInt(br.readLine());
      String[] tops = br.readLine().split(" ");
      Stack<Top> topStack = new Stack<>();

      for (int i = 0; i < n; i++) {
         int topHeight = Integer.parseInt(tops[i]);
         while (!topStack.isEmpty()) {
            if (topStack.peek().getHeight() >= topHeight) {
               bw.write(topStack.peek().getNumber() + " ");
               break;
            }
            topStack.pop();
         }

         if (topStack.isEmpty()) {
            bw.write("0 ");
         }

         topStack.push(new Top(topHeight, i + 1));
      }

      bw.flush();
      bw.close();
      br.close();

   }
}
