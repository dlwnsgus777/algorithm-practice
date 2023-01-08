package baekjoon.basic.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudyWord2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String word = bf.readLine().toUpperCase();
        bf.close();

        int[] cnt = new int[26];
        int count = 0;
        char result = '?';

        for (int i = 0; i < word.length(); i++) {
            cnt[word.charAt(i) -65]++;
            if (cnt[word.charAt(i) -65] > count) {
                result = word.charAt(i);
                count = cnt[word.charAt(i) -65];
            } else if (cnt[word.charAt(i) -65] == count) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
