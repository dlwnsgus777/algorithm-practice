package basic.forExam;

import java.util.Scanner;

public class NPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        n = sc.nextInt();

        System.out.println(((n + 1) * n) / 2);
    }
}
