package basic.whileExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = a;
        int count = 0;

        if(a < 10) {
            a *= 10;
        }

        while(a != b) {
            System.out.println(b);
            b = (b % 10) * 10 + ((b / 10) + (b % 10)) % 10;
            count++;
        };

        System.out.println(count);
    }
}
