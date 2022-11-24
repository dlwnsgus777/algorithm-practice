package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// TODO: 풀지 못함
public class 삼십 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   public static void main(String[] args) throws IOException {
      String[] arr = br.readLine().split("");
      List<Integer> list = Arrays.stream(arr).map(Integer::parseInt).collect(Collectors.toList());

      System.out.println(list);
   }
}
