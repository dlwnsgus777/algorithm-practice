package baekjoon.basic.dynamicProgramming;

import java.util.Scanner;

public class Fibo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] check = new long[91];
        check[0] = 0;
        check[1] = 1;

        for (int i = 2; i <= n; i++) {
            check[i] = check[i - 2] + check[i - 1];
        }

        System.out.println(check[n]);
    }
}
