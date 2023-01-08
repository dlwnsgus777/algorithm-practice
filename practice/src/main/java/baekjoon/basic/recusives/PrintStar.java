package baekjoon.basic.recusives;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class PrintStar {
    static String[][] star;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        star = new String[n][n];

        for (int i = 0; i < star.length; i++) {

            for (int j = 0; j < star[i].length; j++) {
                star[i][j] = " ";
            }
        }

        print(n, 0, 0);

        for (int i = 0; i < star.length; i++) {

            for (int j = 0; j < star[i].length; j++) {
                bw.write(star[i][j]);
            }
            bw.write('\n');
        }

        bw.close();
    }

    public static void print(int n, int x, int y) {
        if (n == 1) {
            star[x][y] = "*";
            return;
        }

        n = n / 3;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                print(n, x + (n * i), y + (n * j));
            }
        }
    }
}
