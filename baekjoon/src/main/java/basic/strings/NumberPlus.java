package basic.strings;

import java.util.Scanner;

public class NumberPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String b = sc.nextLine();

        String[] arr = b.split("");

        int result = 0;

        for(int i = 0; i < arr.length; i++) {
            result += Integer.parseInt(arr[i]);
        }

        System.out.println(result);
    }
}
