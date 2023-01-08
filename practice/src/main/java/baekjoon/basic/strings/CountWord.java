package baekjoon.basic.strings;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().trim();
        System.out.println(word.split(" ").length);

        sc.close();
    }
}
