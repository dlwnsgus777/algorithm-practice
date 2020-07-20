package basic.math2;

import java.util.Scanner;

public class TaxicabGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        String result = String.format("%.6f", (num * num) * Math.PI);
        String result2 = String.format("%.6f", (num * num) * 2);

        System.out.println(result);
        System.out.println(result2);
    }
}
