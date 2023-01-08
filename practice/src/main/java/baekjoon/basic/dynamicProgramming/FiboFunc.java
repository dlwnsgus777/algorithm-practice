package baekjoon.basic.dynamicProgramming;

import java.util.Scanner;

public class FiboFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[][] check = new int[41][2];

        check[0][0] = 1;
        check[1][1] = 1;

        for (int i = 2; i < 41; i++) {
            for (int j = 0; j < 2; j++) {
                check[i][j] = check[i - 1][j] + check[i - 2][j];
            }
        }

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(check[n][0] + " " + check[n][1]);
        }
    }
}
