package basic.arr;

import java.util.Scanner;

public class OXExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt();
        String[] arr = new String[leng];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for(int i = 0; i < arr.length; i++) {
            int result = 0;
            int n = 0;
            for(int j = 0; j < arr[i].length(); j++) {
                char ox = arr[i].charAt(j);
                if(ox == 'O') {
                    n++;
                    result += n;
                } else {
                    n = 0;
                }
            }
            System.out.println(result);
        }
    }
}
