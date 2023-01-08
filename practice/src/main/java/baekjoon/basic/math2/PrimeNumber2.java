package baekjoon.basic.math2;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        int fir = 0;
        boolean has = false;

        for (int i = M; i <= N; i++) {
            if (i == 1) {
                continue;
            }
            boolean check = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                has = true;
                if (sum == 0) {
                    fir = i;
                }
                sum += i;
            }
        }

        if (has) {
            System.out.println(sum);
            System.out.println(fir);
        } else {
            System.out.println(-1);
        }
    }
}
