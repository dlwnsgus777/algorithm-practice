package baekjoon.basic.test1;

import java.util.Scanner;

public class SanggnNaldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] bugger = new int[3];
        int[] bever = new int[2];

        int min = 99999;

        for(int i = 0; i < bugger.length; i++) {
            bugger[i] = sc.nextInt();
        }

        for(int i = 0; i < bever.length; i++) {
            bever[i] = sc.nextInt();
        }

        for (int i = 0; i < bugger.length; i++) {
            for (int j = 0; j < bever.length; j++) {
                int set = bugger[i] + bever[j] - 50;
                if (set < min) {
                    min = set;
                }
            }
        }
        System.out.println(min);
    }
}
