package baekjoon.basic.math1;

import java.util.Scanner;

public class ACMHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int h = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());
            int n = sc.nextInt();

            calcCustomer(h, w, n);
        }
    }

    public static void calcCustomer(int h, int w, int n) {
        int floor = n - ((n / h) * h);
        if (n % h == 0) {
            floor = n / h;
        }
        int cnt = (n / h);// + 1;

        if (cnt < 10) {
            System.out.println(floor + "0" + cnt);
        } else {
            System.out.println(floor + "" + cnt);
        }
    }
}

// 정답코드
//import java.util.Scanner;
//
//public class AcmHotel {
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//
//        for(int i  = 0; i< T; i++) {
//            int H = sc.nextInt();
//            int W = sc.nextInt();
//            int N = sc.nextInt();
//            int x = (N/H) + 1;
//            int y = N%H;
//            if(N%H==0) {
//                x = N/H;
//                y = H;
//            }
//            System.out.println(y*100+x);
//        }
//    }
//}
