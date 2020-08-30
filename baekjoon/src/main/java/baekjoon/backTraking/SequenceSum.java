package baekjoon.backTraking;

import java.util.Scanner;

public class SequenceSum {
    static int n, s, result;
    static int[] num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();

        num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        result = 0;
        for (int i = 0; i < n; i++) {
            dfs(num[i], i);
        }
        System.out.println(result);
    }

    public static void dfs(int sum, int count) {
        if (sum == s && count == n - 1) {
            result++;
            return;
        }
        count++;

        if (count < n) {
            dfs(sum + num[count], count);
            dfs(sum, count);
        }
    }
}
