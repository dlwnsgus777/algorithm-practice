package baekjoon.basic.arr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 개수세기 {
   public static void main(String[] args) {
      Map<Integer, Integer> map = new HashMap<>();
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      for (int i = 0; i < n; i++) {
         int key = sc.nextInt();

         if (map.containsKey(key)) {
            map.replace(key, map.get(key) + 1);
         } else {
            map.put(key, 1);
         }
      }

      int a = sc.nextInt();

      System.out.println(map.get(a) == null ? 0 : map.get(a));
   }
}
