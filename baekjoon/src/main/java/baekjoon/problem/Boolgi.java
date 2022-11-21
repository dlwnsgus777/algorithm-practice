package baekjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boolgi {
   static final int YEAR = 543;
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   public static void main(String[] args) throws IOException {
      String in = br.readLine();
      int cal = Integer.parseInt(in) - YEAR;
      System.out.println(cal);
   }
}
