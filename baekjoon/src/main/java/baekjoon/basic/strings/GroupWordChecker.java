package baekjoon.basic.strings;

import java.util.Scanner;

public class GroupWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int result = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            if (checkWord(word)) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static boolean checkWord(String word) {
        boolean[] check = new boolean[26];
        boolean returnBol = true;

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (check[index]) {
                if (word.charAt(i) != word.charAt(i - 1)) {
                    returnBol = false;
                    break;
                }
            } else {
                check[index] = true;
            }
        }
        return returnBol;
    }
}
