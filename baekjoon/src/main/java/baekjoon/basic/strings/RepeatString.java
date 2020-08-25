package baekjoon.basic.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class RepeatString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[t];

        for (int i = 0; i < arr.length; i++) {
           String[] strArr = br.readLine().replace(" ", "").split("");
           String result = "";
           for (int j = 1; j < strArr.length; j++) {
               int repeat = Integer.parseInt(strArr[0]);
               result += String.join("", Collections.nCopies(repeat, strArr[j]));
           }
            System.out.println(result);
        }
        br.close();
    }
}
