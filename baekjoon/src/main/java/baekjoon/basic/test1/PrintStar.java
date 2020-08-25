package baekjoon.basic.test1;

import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = a * 2 - 1;
        String star = "";
        String star2 = "";

        for(int i = 0; i < x; i++) {
            if (i >= a) {
                star2 = star.substring(0, x - i);
                System.out.println(star2);
                continue;
            }
            star += "*";
            System.out.println(star);
        }
    }
}
