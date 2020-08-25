package baekjoon.basic.functions;

import java.util.Scanner;

public class OneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        for(int i = 1; i <= n; i++) {
            if (check(i)) {
                result++;
            }
        }

        System.out.println(result);
    }

    public static boolean check(int number) {
        if(number < 100) {
            return true;
        }

        if (number < 1000) {
            int a = number % 10;
            number /= 10;
            int b = number % 10;
            number /= 10;
            int c = number;
            return (a - b) == (b - c);
        }

        int a = number % 10;
        number /= 10;
        int b = number % 10;
        number /= 10;
        int c = number;
        number /= 10;
        int d = number % 10;
        return (a - b) == (b - c) && (b - c) == (c - d);
    }
}
