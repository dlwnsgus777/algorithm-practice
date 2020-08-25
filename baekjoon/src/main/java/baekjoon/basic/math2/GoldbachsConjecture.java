package baekjoon.basic.math2;

import java.util.Scanner;

public class GoldbachsConjecture {
    public static void main(String[] args) {
        // 어렵다 더많은 고민 필요
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();

            if (checkHalf(num / 2)) {
                System.out.println(num + " " + num);
            } else {
                goldBach(num);
            }
        }
    }

    public static boolean checkHalf(int num) {
        boolean check = true;

        for(int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }

        return check;
    }

    public static void goldBach(int num) {
        System.out.println("gold : "+ num);
    }
}
