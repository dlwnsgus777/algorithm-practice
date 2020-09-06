package baekjoon.basic.dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class RGB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] house = new int[n][3];
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                house[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(house[i][j] + " ");
            }
            System.out.println();
        }
    }
}
