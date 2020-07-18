package basic.math2;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();//Integer.parseInt(sc.next());
        int b = sc.nextInt();//Integer.parseInt(sc.next());
        int c = sc.nextInt();//Integer.parseInt(sc.next());

        while(a + b + c != 0) {
            if ((a * a) + (b * b) == (c * c)) {
                System.out.println("right");
            } else if ((a * a) + (c * c) == (b * b)) {
                System.out.println("right");
            } else if ((c * c) + (b * b) == (a * a)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

            a = sc.nextInt();//Integer.parseInt(sc.next());
            b = sc.nextInt();//Integer.parseInt(sc.next());
            c = sc.nextInt();//Integer.parseInt(sc.next());
        }
    }
}
