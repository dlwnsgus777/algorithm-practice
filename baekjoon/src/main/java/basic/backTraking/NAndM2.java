package basic.backTraking;

import java.util.Scanner;

public class NAndM2 {
    static int n, m;
    static boolean[] check;
    static int[] list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        check = new boolean[8];
        list = new int[m];

        dfs(0, 1);
    }

    public static void dfs(int count, int start) {
        if (count == m) {
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println("");
            return;
        }

        for (int i = start; i <= n; i++) {

            if (!check[i]) {
                check[i] = true;
                list[count] = i;
                dfs(count + 1, i);
                check[i] = false;
            }
        }
    }
}

// 정답 코드
//import java.util.Scanner;
//
//public class Main {
//
//    public static int[] arr;
//    public static int N, M;
//
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        N = in.nextInt();
//        M = in.nextInt();
//
//        arr = new int[M];
//
//        dfs(1, 0);
//
//    }
//
//    public static void dfs(int at, int depth) {
//
//        if (depth == M) {
//            for (int val : arr) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//            return;
//        }
//
//        for (int i = at; i <= N; i++) {
//
//            arr[depth] = i;
//            dfs(i + 1, depth + 1);
//
//        }
//    }
//}