package basic.math2;

import java.util.Arrays;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int wMinx = w - x;
        int hMinY = h - y;

        int[] arr = {x, y, wMinx, hMinY};

        Arrays.sort(arr);

        System.out.println(arr[0]);

    }
}
