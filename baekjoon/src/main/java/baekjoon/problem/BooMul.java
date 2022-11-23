package baekjoon.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BooMul {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   public static void main(String[] args) throws IOException {
      int n = Integer.parseInt(br.readLine());
      String[] aA = br.readLine().split(" ");
      String[] bA = br.readLine().split(" ");

      int result = 0;

      List<Integer> a = new ArrayList<>();
      List<Integer> b = new ArrayList<>();

      for (int i = 0; i < n; i++) {
         a.add(Integer.valueOf(aA[i]));
         b.add(Integer.valueOf(bA[i]));
      }

      Collections.sort(a);
      Collections.sort(b, Collections.reverseOrder());

      for (int i = 0; i < n; i++) {
         result += a.get(i) * b.get(i);
      }

      System.out.println(result);

      br.close();
   }
}
