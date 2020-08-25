package baekjoon.basic.sort;

import java.util.Arrays;
import java.util.Scanner;

public class WordSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, (a1, a2) -> {
            if (a1.length() == a2.length()) {
                return a1.compareTo(a2);
            } else {
                return a1.length() - a2.length();
            }
        });

        Arrays.stream(arr).distinct().forEach(s -> System.out.println(s));
    }
}
