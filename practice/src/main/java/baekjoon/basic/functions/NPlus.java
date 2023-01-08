package baekjoon.basic.functions;

import java.util.Scanner;

public class NPlus {
    long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}
