package baekjoon.basic.arr;

import java.io.*;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxNumIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int max = -10000;
        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(br.readLine());
            if (max < num) {
                max = num;
                index = i + 1;
            }
        }

        bw.write(max + "\n" + index);

        bw.flush();
    }
}
