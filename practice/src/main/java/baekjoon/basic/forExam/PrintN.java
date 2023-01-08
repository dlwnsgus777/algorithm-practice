package baekjoon.basic.forExam;

import java.io.*;
import java.util.StringTokenizer;

public class PrintN {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= t; i++) {

            bw.write(i + "\n");
        }

        bw.flush();
    }
}
