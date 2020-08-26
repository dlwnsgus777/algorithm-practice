package baekjoon.backTraking;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
    static int[] lotto;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            lotto = new int[n];

            for (int i = 0; i < n; i++) {
                lotto[i] = sc.nextInt();
            }

            System.out.println(Arrays.toString(lotto));
        }
    }
}
