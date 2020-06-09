package basic.test1;

import java.util.Scanner;

public class PrintStar2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * a - 1) - (2 * i); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < a - 1; i++) {
            for (int j = 1; j < (a - 1) - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 3 + 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
