package baekjoon.basic.sort;

import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        OptionalDouble avg = Arrays.stream(arr).average();

        Set<Integer> all = new HashSet<>();
        int[] duple = Arrays.stream(arr).filter(b -> !all.add(b)).toArray();

        int third = 0;

        if (duple.length <= 0) {
            if (n == 1) {
                third = arr[0];
            } else {
                third = arr[1];
            }
        } else {
            third = duple[1];
        }

        System.out.println(Math.round(avg.getAsDouble()));
        System.out.println(arr[n / 2]);
        System.out.println(third);
        System.out.println(Math.abs(arr[0] - arr[n - 1]));
    }
}
