package baekjoon.basic.ifExam;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour, minute;

        hour = sc.nextInt();
        minute = sc.nextInt();

        if (minute < 45) {
            int alarmH = hour == 0 ? 23 : hour - 1;
            System.out.println( alarmH + " " + (minute + 60 - 45));
        } else {
            System.out.println((hour) + " " + (minute - 45));
        }
    }
}
