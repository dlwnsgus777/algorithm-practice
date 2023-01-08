package baekjoon.basic.recusives;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fac(n));

    }

    public static int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * fac(n - 1);
    }
}
