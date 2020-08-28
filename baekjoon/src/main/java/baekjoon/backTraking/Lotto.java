package baekjoon.backTraking;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
    static int[] lotto, result;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            }

            lotto = new int[n + 1];
            result = new int[n + 1];

            for (int i = 0; i < n; i++) {
                lotto[i] = sc.nextInt();
            }

            dfs(0, 0);
            System.out.println();
        }
    }

    public static void dfs(int count, int start) {
        if (count == 6) {
            for (int i = 0; i < n; i++) {
                if (result[i] == 1) {
                    System.out.print(lotto[i] + " ");
                }
            }
            System.out.println();
            return;
        }

        for (int i = start; i < n; i++) {
            result[i] = 1;
            dfs(count + 1, i + 1);
            result[i] = 0;
        }
    }
}
