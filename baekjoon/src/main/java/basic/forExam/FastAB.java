package basic.forExam;

import java.io.*;
import java.util.StringTokenizer;

public class FastAB {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(bf.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(a + b + "\n");
        }

        bw.flush();
    }
}
