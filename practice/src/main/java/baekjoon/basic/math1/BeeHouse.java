package baekjoon.basic.math1;

import java.util.Scanner;

public class BeeHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 1;
        int inter = 6;
        int range = 1;


        while (true) {
            if (range >= n) {
                break;
            }

            range += result * inter;
            result++;
        }

        System.out.println(result);
    }
}
