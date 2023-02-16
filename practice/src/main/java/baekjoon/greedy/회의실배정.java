package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 회의실배정 {
   static class Meeting implements Comparable<Meeting> {
      private final int start;
      private final int end;

      Meeting(int start, int end) {
         this.start = start;
         this.end = end;
      }

      @Override
      public int compareTo(Meeting o) {
         if (this.end == o.end) {
            return this.start - o.start;
         }
         return this.end - o.end;
      }
   }
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine());
      List<Meeting> meetings = new ArrayList<>();

      int endTime = 0;
      int cnt = 0;

      for (int i = 0; i < N; i++) {
         String[] input = br.readLine().split(" ");

         int start = Integer.parseInt(input[0]);
         int end = Integer.parseInt(input[1]);

         meetings.add(new Meeting(start, end));
      }

      Collections.sort(meetings);

      for (Meeting meeting : meetings) {
         if (endTime <= meeting.start) {
            endTime = meeting.end;
            cnt++;
         }
      }

      System.out.println(cnt);


      br.close();
   }
}
