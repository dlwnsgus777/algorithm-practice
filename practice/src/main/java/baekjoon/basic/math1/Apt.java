package baekjoon.basic.math1;

import java.util.Scanner;

public class Apt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[][] apt = new int[15][15];

        for (int i = 1; i < apt[0].length; i++) {
            apt[0][i] = i;
        }

        for (int i = 1; i < apt.length; i++) {
            for (int j = 1; j < apt[i].length; j++) {
                apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
            }
        }

        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(apt[k][n]);
        }
    }
}
