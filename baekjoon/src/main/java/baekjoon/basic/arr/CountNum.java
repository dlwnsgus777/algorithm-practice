package baekjoon.basic.arr;

import java.util.Scanner;
import java.util.stream.Stream;

public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int multiple = a * b * c;

        int[] arr = Stream.of(String.valueOf(multiple).split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
