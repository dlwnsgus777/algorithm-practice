package baekjoon.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 수정렬하기3 {
   public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
         int N = Integer.parseInt(br.readLine());
         int[] arr = new int[N];

         for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
         }

         Arrays.sort(arr);

         for (int i = 0; i < N; i++) {
            bw.write(arr[i] + "\n");
         }

//         List<Integer> list = new ArrayList<>();
//
//
//         while (N != 0) {
//            int num = Integer.parseInt(br.readLine());
//
//            list.add(num);
//
//            N--;
//         }
//
//         Collections.sort(list);
//
//         for (Integer integer : list) {
//            bw.write(integer + "\n");
//         }

         bw.flush();

      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
