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

//        if(a < 10) {
//            a = a * 10;
//        }

        do {
            int f = b / 10;
            int s = b % 10;
            b = s * 10 + ((f + s) % 10);
            count++;
        } while(a != b);

        System.out.println(count);
    }
}
