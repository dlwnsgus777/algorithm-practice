package baekjoon.basic.backTraking;

import java.util.Arrays;
import java.util.Scanner;

public class Sudoku {
    static int[][] table;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        table = new int[9][9];

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(sc.next());

                table[i][j] = num;
            }
        }

        for(int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
