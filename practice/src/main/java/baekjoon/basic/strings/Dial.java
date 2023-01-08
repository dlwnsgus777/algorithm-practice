package baekjoon.basic.strings;

import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int result = 0;

        for(int i = 0; i < word.length(); i++) {
            int checkNum = checkDial(word.charAt(i));
            result += checkNum;
        }

        System.out.println(result);
    }

    public static int checkDial(char alphabet) {
        int returnNumber = 0;
        switch (alphabet) {
            case 'A': case 'B': case 'C':
                returnNumber = 2;
                break;
            case 'D': case 'E': case 'F':
                returnNumber = 3;
                break;
            case 'G': case 'H': case 'I':
                returnNumber = 4;
                break;
            case 'J': case 'K': case 'L':
                returnNumber = 5;
                break;
            case 'M': case 'N': case 'O':
                returnNumber = 6;
                break;
            case 'P': case 'Q': case 'R': case 'S':
                returnNumber = 7;
                break;
            case 'T': case 'U': case 'V':
                returnNumber = 8;
                break;
            case 'W': case 'X': case 'Y': case 'Z':
                returnNumber = 9;
                break;
            default:
                returnNumber = 1;
                break;
        }
        return returnNumber + 1;
    }
}
