package basic.backTraking;

import java.util.Scanner;

public class NAndM3 {
    static int n, m;
    static int[] list;
    static boolean[] check;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         sb = new StringBuilder();

        n = sc.nextInt();
        m = sc.nextInt();

        list = new int[m];
        check = new boolean[n];
        dfs(0);

        System.out.println(sb.toString());
    }

    public static void dfs(int count) {
        if (count == m) {
            for (int i = 0; i < list.length; i++) {
                sb.append(list[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {

            list[count] = i;
            dfs(count + 1);
        }
    }
}
