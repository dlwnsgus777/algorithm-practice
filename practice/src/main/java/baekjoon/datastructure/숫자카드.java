package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class 숫자카드 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
         int N = Integer.parseInt(br.readLine());
         Map<String, Integer> map = new HashMap<>();
         String[] arr = br.readLine().split(" ");

         for (String a : arr) {
            Integer value = map.get(a);

            if (value == null) {
               map.put(a, 1);
            } else {
               map.replace(a, value + 1);
            }

//            if (map.containsKey(a)) {
//               map.replace(a, map.get(a) + 1);
//            } else {
//               map.put(a, 1);
//            }
         }

         int M = Integer.parseInt(br.readLine());
         String[] keys = br.readLine().split(" ");

         for (String key : keys) {
            Integer value = map.get(key);

            if (value == null) {
               value = 0;
            }

            bw.write(value + " ");
         }

         bw.flush();

      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
