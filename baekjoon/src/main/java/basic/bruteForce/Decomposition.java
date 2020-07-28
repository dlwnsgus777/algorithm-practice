package basic.bruteForce;

import java.util.Scanner;

public class Decomposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        int sum = 0;
        int part = 0;

        for (int i = 1; i < n; i++) {
            sum = i;
            part = i;

            while (part != 0) {
                sum += part % 10;
                part /= 10;
            }

            if (n == sum) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
