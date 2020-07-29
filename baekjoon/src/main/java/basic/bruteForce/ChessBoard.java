package basic.bruteForce;

import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[][] board = new String[n][m];

        for (int i = 0; i < board.length; i++) {
            String yaxis = sc.next();

            for (int j = 0; j < yaxis.length(); j++) {
                board[i][j] = String.valueOf(yaxis.charAt(j));
            }
        }



        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
