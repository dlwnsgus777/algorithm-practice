package basic.ifExam;

import java.util.Scanner;

public class Record {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        a = sc.nextInt();

        a = a / 10;

        switch (a) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
