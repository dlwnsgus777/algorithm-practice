package baekjoon.basic.test1;

import java.util.Scanner;

public class AvgScrore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int avg = 0;

        while (sc.hasNext()) {
            int a = sc.nextInt();
            if (a < 40) {
                a = 40;
            }
            sum = sum + a;
            count++;
        }
        avg = sum / count;
        System.out.println(avg);
    }
}
