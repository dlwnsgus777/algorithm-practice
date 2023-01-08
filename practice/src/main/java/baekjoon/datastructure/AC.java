package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


// 문제 풀이 참고 중
public class AC {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
         int T = Integer.parseInt(br.readLine());

         while (T != 0) {
            String[] pArr = br.readLine().split(" ");

            int n = Integer.parseInt(br.readLine());
            int[] numbers = new int[n];

            String[] input = br.readLine().split(",");
            input[0] = String.valueOf(input[0].charAt(1));
            input[input.length - 1] = String.valueOf(input[input.length - 1].charAt(input[input.length - 1].length() -1));

            for (int i = 0; i < input.length; i++) {
               System.out.print(input[i] + " ");
            }


            T--;
         }



      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
