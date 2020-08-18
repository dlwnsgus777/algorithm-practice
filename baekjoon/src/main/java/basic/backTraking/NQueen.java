package basic.backTraking;

import java.util.Arrays;
import java.util.Scanner;

public class NQueen {
    static int n, result;
    static int[] col;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            col = new int[n + 1];
            col[1] = i;
            dfs(col, 1);
        }
        System.out.println(result);
    }

    public static void dfs(int[] col, int row) {
        if (row == n) {
            result++;
            return;
        }

        for (int i = 1; i <= n; i++) {
           col[row + 1] = i;
           if (check(col, row + 1)) {
               dfs(col, row + 1);
           }
        }
    }

    public static boolean check(int[] col, int row) {
        for (int i = 1; i < row; i++) {
            if (col[i] == col[row]) {
                return false;
            }
            if (Math.abs(i - row) == Math.abs(col[i] - col[row])) {
                return false;
            }
        }
        return true;
    }
}
