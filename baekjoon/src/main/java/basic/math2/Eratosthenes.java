package basic.math2;

import java.util.Scanner;

public class Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.next());
        int end = Integer.parseInt(sc.next());

        int[] arr = new int[end + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        arr[1] = 0;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != 0) {

                for (int j = 2 * i; j < arr.length; j += i) {
                    if (arr[j] != 0) {
                        arr[j] = 0;
                    }
                }
            }
        }

        for(int i = start; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
