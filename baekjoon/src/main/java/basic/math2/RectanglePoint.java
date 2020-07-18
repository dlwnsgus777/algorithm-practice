package basic.math2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RectanglePoint {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int[] x = new int[3];
        int[] y = new int[3];

        int nx, ny = 0;

        for (int i = 0; i < x.length; i++) {
            st = new StringTokenizer(bf.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        bf.close();

        if (x[0] == x[1]) {
            nx = x[2];
        } else {
            nx = x[1] == x[2] ? x[0] : x[1];
        }

        if (y[0] == y[1]) {
            ny = y[2];
        } else {
            ny = y[1] == y[2] ? y[0] : y[1];
        }

        System.out.println(nx + " " + ny);
    }
}
