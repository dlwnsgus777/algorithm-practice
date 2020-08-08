package basic.sort;

import java.util.Arrays;
import java.util.Scanner;

public class AgeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.next();
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]);
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]);
            }

            System.out.println();
        }
    }
}
