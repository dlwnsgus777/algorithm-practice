package baekjoon.basic.strings;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 학점계산 {
   public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in);
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
         String a = sc.next();

         if (a.equals("A+")) {
            bw.write("4.3");
         } else if (a.equals("A0")) {
            bw.write("4.0");
         } else if (a.equals("A-")) {
            bw.write("3.7");
         } else if (a.equals("B+")) {
            bw.write("3.3");
         } else if (a.equals("B0")) {
            bw.write("3.0");
         } else if (a.equals("B-")) {
            bw.write("2.7");
         } else if (a.equals("C+")) {
            bw.write("2.3");
         } else if (a.equals("C0")) {
            bw.write("2.0");
         } else if (a.equals("C-")) {
            bw.write("1.7");
         } else if (a.equals("D+")) {
            bw.write("1.3");
         } else if (a.equals("D0")) {
            bw.write("1.0");
         } else if (a.equals("D-")) {
            bw.write("0.7");
         } else {
            bw.write("0.0");
         }

         bw.flush();

      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
