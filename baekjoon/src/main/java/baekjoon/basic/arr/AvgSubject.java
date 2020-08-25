package baekjoon.basic.arr;

import java.util.Scanner;
import java.util.stream.Stream;

public class AvgSubject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjectLeng = sc.nextInt();
        double max = -9999;
        double[] arr = new double[subjectLeng];
        double result = 0;

        for(int i = 0; i < subjectLeng; i++) {
            int a = sc.nextInt();

            if (max < a) {
                max = a;
            }

            arr[i] = a;
        }

        for (int i = 0; i < arr.length; i++) {
            double a = arr[i] / max * 100;
            result += a;
        }

        System.out.println(result / subjectLeng);
    }
}
