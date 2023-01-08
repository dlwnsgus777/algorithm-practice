package baekjoon.basic.backTraking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Operator {
    static int n;
    static int[] number, oper;
    static List<Integer> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        list = new ArrayList<>();
        n = sc.nextInt();
        number = new int[n];
        oper = new int[4];

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            oper[i] = sc.nextInt();
        }

        dfs(1, number[0]);

        Collections.sort(list);

        System.out.println(list.get(list.size() - 1));
        System.out.println(list.get(0));
    }

    public static void dfs(int start, int result) {
        for (int i = 0; i < 4; i++) {
            if (oper[i] != 0) {
                oper[i]--;
                switch (i) {
                    case 0:
                        dfs(start + 1, result + number[start]);
                        break;
                    case 1:
                        dfs(start + 1,  result - number[start]);
                        break;
                    case 2:
                        dfs(start + 1, result * number[start]);
                        break;
                    case 3:
                        dfs(start + 1, result / number[start]);
                        break;
                }
                oper[i]++;
            }
        }
        if (start == n) {
            list.add(result);
        }
    }
}
