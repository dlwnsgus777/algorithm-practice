package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class 집합 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int N = Integer.parseInt(br.readLine());
      Set<Integer> set = new HashSet<>();
      Set<Integer> allSet = new HashSet<>();

      for (int i = 1; i <= 20; i++) {
         allSet.add(i);
      }

      while (N != 0) {
         String[] input = br.readLine().split(" ");

         if (input.length == 2) {
            int number = Integer.parseInt(input[1]);
            switch (input[0]) {
               case "add":
                  set.add(number);
                  break;
               case "check":
                  if (set.contains(number)) {
                     bw.write("1\n");
                  } else {
                     bw.write("0\n");
                  }
                  break;
               case "remove":
                  set.remove(number);
                  break;
               case "toggle":
                  if (set.contains(number)) {
                     set.remove(number);
                  } else {
                     set.add(number);
                  }
                  break;
            }

         } else {
            if (input[0].equals("all")) {
               set = allSet;
            } else {
               set.clear();
            }
         }

         N--;
      }

      bw.flush();
      br.close();
      bw.close();
   }

}
