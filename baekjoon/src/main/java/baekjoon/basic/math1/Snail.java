package baekjoon.basic.math1;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int v = Integer.parseInt(sc.next());
        int c = a - b;

        int result = 1;

        if ((v - a) - (c * ((v - a) / c)) > 0) {
            result  += ((v - a) / c) + 1;
        } else {
            result += ((v - a) / (c));
        }

        System.out.println(result);
    }
}
