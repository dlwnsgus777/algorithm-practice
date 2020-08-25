package baekjoon.basic.arr;

import java.util.Scanner;
import java.util.stream.Stream;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num % 42;
        }

        for(int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
