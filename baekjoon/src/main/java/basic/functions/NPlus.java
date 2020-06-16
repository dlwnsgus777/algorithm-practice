package basic.functions;

import java.util.Scanner;

public class NPlus {
    public static void main(String[] args) {

    }
    public long sum(int[] a) {
        long result = 0;

        for(int b: a) {
            result += b;
        }
        return result;
    }
}
