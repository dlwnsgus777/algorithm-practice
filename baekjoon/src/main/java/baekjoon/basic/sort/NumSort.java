package baekjoon.basic.sort;

import java.util.Scanner;

public class NumSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int index = i - 1;

            while (index >= 0 && key < arr[index]) {
                arr[index + 1] = arr[index];

                index--;
            }
            arr[index + 1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
