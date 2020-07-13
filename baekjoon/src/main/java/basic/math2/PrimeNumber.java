package basic.math2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.next());
            if (num == 1) {
                continue;
            }
            boolean check = true;

            for(int j = 2; j*j <= num; j++) {
                if (num % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                result++;
            }
        }

        System.out.println(result);
    }
}
