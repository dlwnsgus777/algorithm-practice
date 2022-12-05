package baekjoon.basic.arr;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 과제안내신분 {
   public static void main(String[] args) throws IOException {
      int[] st = new int[31];
      Scanner sc = new Scanner(System.in);
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      for (int i = 1; i < 29; i++) {
         int num = sc.nextInt();
         st[num] = 1;
      }

      for (int i = 1; i < st.length; i++) {
         if (st[i] != 1) {
            bw.write(i + "\n");
         }
      }

      bw.flush();
      bw.close();
      sc.close();
   }
}
