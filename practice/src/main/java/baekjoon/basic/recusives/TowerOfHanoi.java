package baekjoon.basic.recusives;

import java.io.IOException;
import java.util.Scanner;

public class TowerOfHanoi {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        sb.append((int)Math.pow(2, n) - 1 );
        sb.append('\n');

        hanoi(n, 1, 2, 3);

        System.out.println(sb);
    }

    public static void hanoi(int n, int first, int second, int third) throws IOException {

        if (n == 1) {
            sb.append(first + " " + third);
            sb.append('\n');
            return;
        }

        hanoi(n - 1, first, third, second);
        sb.append(first + " " + third);
        sb.append('\n');
        hanoi(n - 1, second, first, third);

    }
}
