package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 수찾기 {
   public static void main(String[] args) {
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
         int n = Integer.parseInt(br.readLine());
         Map<String, Integer> map = new HashMap<>();

         String[] in = br.readLine().split(" ");

         for (String s : in) {
            map.put(s, 0);
         }

         int m = Integer.parseInt(br.readLine());
         String[] inputMArray = br.readLine().split(" ");

         List<String> inputMList = new ArrayList<>(Arrays.asList(inputMArray));

         for(String num : inputMList) {
            if (map.containsKey(num)) {
               System.out.println("1");
            } else {
               System.out.println("0");
            }
         }


      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
