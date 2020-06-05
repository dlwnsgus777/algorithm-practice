package basic.whileExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = 0;
        int count = 0;

        if(a < 10) {
            a *= 10;
        }

        int first = a / 10;
        int second = a % 10;

        while(a != b) {
            int sum = (first + second) %  10;
            b = second * 10 + sum;
            first = b / 10;
            second = b % 10;
            count++;
        }
        System.out.println(count);
    }
}
