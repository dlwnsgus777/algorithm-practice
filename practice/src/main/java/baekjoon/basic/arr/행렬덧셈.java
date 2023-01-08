package baekjoon.basic.arr;

import java.util.Scanner;

public class 행렬덧셈 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();


      int[][] a = new int[n][m];
      int[][] b = new int[n][m];
      int[][] c = new int[n][m];

      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[i].length; j++) {
            a[i][j] = sc.nextInt();
         }
      }

      for (int i = 0; i < b.length; i++) {
         for (int j = 0; j < b[i].length; j++) {
            b[i][j] = sc.nextInt();
         }
      }

      for (int i = 0; i < c.length; i++) {
         for (int j = 0; j < c[i].length; j++) {
            c[i][j] = a[i][j] + b[i][j];
         }
      }


      for (int i = 0; i < c.length; i++) {
         for (int j = 0; j < c[i].length; j++) {
            System.out.print(c[i][j] + " ");
         }
         System.out.println();
      }
   }
}
