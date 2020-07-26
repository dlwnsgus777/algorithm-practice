package basic.bruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] cards = new int[n];

        for (int i = 0; i < cards.length; i++) {
            cards[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = 0; i < cards.length; i++) {

            for (int j = i + 1; j < cards.length; j++) {

                for (int k = j + 1; k < cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (m == sum) {
                        result = sum;
                        break;
                    }

                    if (m > sum && result < sum) {
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
