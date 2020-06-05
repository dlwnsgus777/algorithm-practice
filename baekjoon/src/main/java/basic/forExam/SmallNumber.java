package basic.forExam;

import java.io.*;
import java.util.Collections;
import java.util.StringTokenizer;

public class SmallNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n, x;
        n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a < x) {
                bw.write(a + " ");
            }
        }
        bw.flush();
    }
}
