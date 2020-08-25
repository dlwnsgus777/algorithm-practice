package baekjoon.basic.math1;

import java.util.Scanner;

public class Sugar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sugar = sc.nextInt();

        if (sugar < 5) {
            if (sugar > 3 || sugar < 3) {
                System.out.println("-1");
                return;
            }
        }

        while(sugar != 0) {
            if (sugar % 5 == 0) {
                count += sugar / 5;
                break;
            }

            if (sugar - 5 > 0) {
                count++;
                sugar -= 5;
            } else {
                count++;
                sugar -= 3;
            }

        }
        System.out.println(count);
    }
}
