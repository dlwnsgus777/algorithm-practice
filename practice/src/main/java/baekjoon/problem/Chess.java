package baekjoon.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.acmicpc.net/problem/3003
public class Chess {
   static int[] chess = {1, 1, 2, 2, 2, 8};
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

   public static void main(String[] args) throws IOException {
      String[] input = br.readLine().split(" ");

      for (int i = 0; i < input.length; i++) {
         int a = Integer.parseInt(input[i]);
         int result = 0;
         
         if (chess[i] > a) {
            result = chess[i] - a;
         } else if (chess[i] < a) {
            result = (a - chess[i]) * -1;
         }

         bw.write(result + " ");
      }

      bw.flush();
      bw.close();
      br.close();
   }
}
