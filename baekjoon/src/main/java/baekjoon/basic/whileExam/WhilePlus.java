package baekjoon.basic.whileExam;

import java.io.*;
import java.util.StringTokenizer;

public class WhilePlus {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int a, b;

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        while(a + b > 0) {
            System.out.println(a + b);
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
        }

    }
}
