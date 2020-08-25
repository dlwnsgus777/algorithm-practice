package baekjoon.basic.strings;

import java.util.Arrays;
import java.util.Scanner;

public class FindAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int[] checker = new int[26];
        Arrays.fill(checker, -1);

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (checker[index] != -1) {
                continue;
            }
            checker[index] = i;
        }

        for(int i = 0; i < checker.length; i++) {
            System.out.print(checker[i]+ " ");
        }

    }
}
