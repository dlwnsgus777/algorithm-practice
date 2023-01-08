package baekjoon.basic.math1;

import java.util.Scanner;

public class Factions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        int up = 0;
        int down = 0;
        String result = "";

        while (i + sum < n) {
            sum += i;
            i++;
        }

        if (i % 2 == 0) {
           up = n - sum;
        } else {
            up = i + 1 - (n - sum);
        }

        down = i + 1 - up;

        result = up + "/" + down;
        System.out.println(result);
    }
}
