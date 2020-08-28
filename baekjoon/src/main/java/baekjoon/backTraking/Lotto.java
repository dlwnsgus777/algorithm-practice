package baekjoon.backTraking;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
    static int[] lotto, result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            lotto = new int[n];
            result = new int[6];

            for (int i = 0; i < n; i++) {
                lotto[i] = sc.nextInt();
            }

            dfs(0);
        }
    }

    public static void dfs(int count) {
        if (count == 6) {
            System.out.println(Arrays.toString(result));
            return;
        }

        for (int i = 0; i < lotto.length; i++) {

            if (result[count] < lotto[i]) {
                result[count] = lotto[i];
                dfs(count + 1);
            }
        }
    }
}
