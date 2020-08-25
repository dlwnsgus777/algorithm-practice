package baekjoon.basic.whileExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WhilePlus2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
           int a, b;
           a = sc.nextInt();
           b = sc.nextInt();

            System.out.println(a + b);
        }

    }
}
