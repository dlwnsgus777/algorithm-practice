package baekjoon.basic.dynamicProgramming;

import java.io.*;

public class Tile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long[] dp = new long[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        if (n >= 3) {
            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 2] % 15746) + (dp[i - 1] % 15746);
            }
        }

        bw.write(dp[n] % 15746 + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
