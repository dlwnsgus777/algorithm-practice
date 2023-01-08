package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 팰린드롬수 {

   public static void main(String[] args) {
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
         String k = br.readLine();
         while (!k.equals("0")) {
            String[] arr = k.split("");
            int i = 0;
            int j = arr.length - 1;

            while(i <= arr.length - 1 || j >= 0) {
               if (i >= j) {
                  bw.write("yes\n");
                  break;
               }

               if (!arr[i].equals(arr[j])) {
                  bw.write("no\n");
                  break;
               }

               i++;
               j--;
            }
            k = br.readLine();
         }

         bw.flush();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
