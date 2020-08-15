package basic.backTraking;

import java.util.Scanner;

public class NQueen {
    static int n;
    static boolean[][] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        check = new boolean[n][n];
    }
}
