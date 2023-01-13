package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 듣보잡 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      String[] in = br.readLine().split(" ");

      int N = Integer.parseInt(in[0]);
      int M = Integer.parseInt(in[1]);

      int C = N + M;
      Map<String, Integer> map = new HashMap<>();
      List<String> list = new ArrayList<>();

      while (C > 0) {
         String name = br.readLine();

         if (map.containsKey(name)) {
            map.replace(name, map.get(name) + 1);
         } else {
            map.put(name, 1);
         }

         C--;
      }

      for (String s : map.keySet()) {
         if (map.get(s) > 1) {
            list.add(s);
         }
      }

      bw.write(list.size() + "\n");

      Collections.sort(list);

      for (String s : list) {
         bw.write(s + "\n");
      }

      bw.flush();
      br.close();
      bw.close();
   }
}
