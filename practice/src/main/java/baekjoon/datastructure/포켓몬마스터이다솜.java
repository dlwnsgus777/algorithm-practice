package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

// 문자열 계산은 HashMao
public class 포켓몬마스터이다솜 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      String[] in = br.readLine().split(" ");

      int N = Integer.parseInt(in[0]);
      int M = Integer.parseInt(in[1]);

      Map<Integer, String> map = new HashMap<>();
      Map<String, Integer> map2 = new HashMap<>();
      int index = 1;

      while(N > 0) {
         String poket = br.readLine();
         map.put(index, poket);
         map2.put(poket, index);

         index++;
         N--;
      }

      while (M > 0) {
         String find = br.readLine();

         if (isNumber(find)) {
            bw.write(map.get(Integer.parseInt(find)) + "\n");
         } else {
            bw.write(map2.get(find) + "\n");
         }

         M--;
      }

      bw.flush();
      br.close();
      bw.close();
   }

   public static boolean isNumber(String str) {
      try {
         Integer.parseInt(str);
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
   }
}
