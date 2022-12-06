package baekjoon.basic.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열 {
   public static void main(String[] args) {
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
         int n = Integer.parseInt(br.readLine());

         for (int i = 0; i < n; i++) {
            char[] a = br.readLine().toCharArray();
            System.out.println(a[0] + "" +  a[a.length - 1]);
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
