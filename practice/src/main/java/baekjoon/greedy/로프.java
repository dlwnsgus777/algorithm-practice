package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 로프 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   public static void main(String[] args) throws IOException {
      int n = Integer.parseInt(br.readLine());
      List<Integer> list = new ArrayList<>();
      List<Integer> result = new ArrayList<>();

      for (int i = 0; i < n; i++) {
         list.add(Integer.parseInt(br.readLine()));
      }

      Collections.sort(list, Collections.reverseOrder());

      for (int i = 0; i < list.size(); i++) {
         result.add(list.get(i) * (i + 1));
      }

      Collections.sort(result);

      System.out.println(result.get(result.size() - 1));
   }
}
