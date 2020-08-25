package baekjoon.basic.arr;

import java.util.Arrays;
import java.util.Scanner;

public class AvgTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        int[] test = new int[c];

        for(int i = 0; i< test.length; i++) {
            int leng = sc.nextInt();
            int cnt = 0;
            int[] arr = new int[leng];
            double total = 0;

            for (int j = 0; j < arr.length; j++) {
                int a = sc.nextInt();
                arr[j] = a;
                total += a;
            }

            double avg = total / (double) leng;

            for (int k = 0; k < arr.length; k++) {
                if (arr[k] > avg) {
                    cnt++;
                }
            }

            double result = (double)cnt / leng * 100;

            System.out.println(String.format("%.3f", result) + "%");
        }
    }
}
