package baekjoon.basic.forExam;

import java.io.*;

public class ReversePrintN {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bf.readLine());

        for (int i = t; i >= 1; i--) {

            bw.write(i + "\n");
        }

        bw.flush();
    }
}
