package basic.bruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class Big {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        int[] result = new int[n];

        Arrays.fill(result, 0);

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (x[i] < x[j]) {

                    if (y[i] < y[j]) {
                        result[i]++;
                    }
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print((result[i] + 1) + " ");
        }
    }
}
