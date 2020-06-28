package basic.strings;

import java.util.Scanner;

public class LiteralNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String A = "";
        String B = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            A += a.charAt(i);
            B += b.charAt(i);
        }

        int AA = Integer.parseInt(A);
        int BB = Integer.parseInt(B);

        int result = AA > BB ? AA : BB;

        System.out.println(result);

    }
}
