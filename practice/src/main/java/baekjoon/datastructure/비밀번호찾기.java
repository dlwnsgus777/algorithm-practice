package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class 비밀번호찾기 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      String[] in = br.readLine().split(" ");

      int N = Integer.parseInt(in[0]);
      int M = Integer.parseInt(in[1]);
      Map<String, String> map = new HashMap<>();


      while (N > 0) {
         String[] input = br.readLine().split(" ");

         map.put(input[0], input[1]);

         N--;
      }

      while (M > 0) {
         String password = br.readLine();

         bw.write(map.get(password) + "\n");

         M--;
      }

      bw.flush();
      br.close();
      bw.close();
   }
}
