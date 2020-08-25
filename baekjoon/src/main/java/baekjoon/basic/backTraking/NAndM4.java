package baekjoon.basic.backTraking;

import java.util.Scanner;

public class NAndM4 {
    static int n, m;
    static int[] list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        list = new int[m];

        dfs(0, 1);
    }

    public static void dfs(int count, int start) {
        if (count == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println("");
            return;
        }

        for (int i = start; i <= n; i++) {
            list[count] = i;
            dfs(count + 1, i);
        }
    }
}
