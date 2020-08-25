package baekjoon.basic.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BertrandsPostulate {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        while(n != 0) {
            int result = 0;

            for (int i = n + 1; i <= n * 2; i++) {
                boolean check = true;
                if (i == 1) {
                    continue;
                }
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    result++;
                }
            }
            System.out.println(result);

            n = Integer.parseInt(bf.readLine());
        }

        bf.close();
    }
}
