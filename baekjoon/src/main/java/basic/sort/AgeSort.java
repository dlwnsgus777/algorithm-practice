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

        Arrays.sort(arr, (e1, e2) -> Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]));

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
