package baekjoon.basic.strings;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 대소문자바꾸기 {
   public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in);
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
         String a = sc.next();
         char[] string = a.toCharArray();

         for (int i = 0; i < string.length; i++) {
            char ch = string[i];
            if (Character.isUpperCase(ch)) { // 대문자라면
               bw.write(Character.toLowerCase(ch));
            } else { // 소문자라면
               bw.write(Character.toUpperCase(ch));
            }
         }

         bw.flush();

      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
