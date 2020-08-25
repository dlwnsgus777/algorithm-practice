package baekjoon.basic.backTraking;

import java.util.Arrays;
import java.util.Scanner;

public class NAndM {
    static int n, m;
    static int[] check;
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        check = new int[m];
        visit = new boolean[n + 1];

//        Arrays.fill(visit, false);

        dfs(0);
    }

    public static void dfs(int count) {
        if (count == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(check[i] + " ");
            }
            System.out.println("");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                check[count] = i;
                dfs(count + 1);
                visit[i] = false;
            }
        }
    }
}


