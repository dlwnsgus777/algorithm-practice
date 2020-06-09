package basic.test1;

import java.util.Scanner;

public class PrintStar3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = a - (a / 2); j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
            for (int j = a / 2; j > 0; j--) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
