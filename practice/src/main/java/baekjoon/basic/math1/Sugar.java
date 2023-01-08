package baekjoon.basic.math1;

import java.io.IOException;
import java.util.Scanner;

public class Sugar {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int result = 0;
        int sugar = sc.nextInt();

        while (sugar > 0) {
            if (sugar < 5 && sugar < 3) {
                result = -1;
                break;
            }

            if (sugar % 5 == 0) {
                result += (sugar / 5);
                break;
            }

            sugar -= 3;
            result += 1;
        }
        System.out.println(result);

        sc.close();
    }
}
