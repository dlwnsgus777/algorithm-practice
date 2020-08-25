package baekjoon.basic.forExam;

import java.io.*;
import java.util.Collections;

public class PrintStar2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 1; i <= tc; i++) {
            for (int j = tc; j >= i + 1; j--) {
                System.out.print(" ");
            }
            String star = String.join("", Collections.nCopies(i, "*"));
            System.out.println(star);
        }
    }
}
