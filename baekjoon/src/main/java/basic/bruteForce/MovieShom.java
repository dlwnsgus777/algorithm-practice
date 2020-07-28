package basic.bruteForce;

import java.util.Scanner;

public class MovieShom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 666;
        int cnt = 0;

        while (cnt != n) {
            int change = num;

            while (change != 0) {
                if (change % 1000 == 666) {
                    cnt++;
                    break;
                }
                change /= 10;
            }
            num++;
        }
        System.out.println(num - 1);
    }
}
