package baekjoon.basic.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudyWord {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String word = bf.readLine().toUpperCase();
        bf.close();
        char[] wordArr = word.toCharArray();
        
        int count = 0;
        char result = 0;
        int len = wordArr.length;

        if (len == 1) {
            System.out.println(wordArr[0]);
            return;
        }

        for (int i = 0; i < len; i++) {
            int check = 0;

            for (int j = i + 1; j < len; j++) {
                if (wordArr[i] == wordArr[j]) {
                    check++;
                }
            }

            if (check > count) {
                result = wordArr[i];
                count = check;
                continue;
            } else if (check == count) {
                result = '?';
                continue;
            }
        }

        System.out.println(result);
    }
}
