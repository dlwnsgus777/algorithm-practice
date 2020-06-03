package basic.io;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();
        int c = b;

        while (b > 0) {
            System.out.println(a * (b % 10));
            b /= 10;
        }
        System.out.println(a * c);
    }
}
