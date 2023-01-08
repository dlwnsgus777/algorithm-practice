package baekjoon.basic.dynamicProgramming;

import java.util.Scanner;

public class PadovanSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] pado = new long[101];

        pado[1] = 1;
        pado[2] = 1;
        pado[3] = 1;

        for (int i = 3; i < pado.length; i++) {
            pado[i] = pado[i - 2] + pado[i - 3];
        }


        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            System.out.println(pado[n]);
        }
    }
}
