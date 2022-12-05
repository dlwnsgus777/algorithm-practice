package baekjoon.basic.io;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 오늘날짜 {
   public static void main(String[] args) {
      System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyy-MM-dd")));
   }
}
