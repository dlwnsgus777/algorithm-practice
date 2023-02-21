package inflean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 결혼식 {
   public static class Person implements Comparable<Person> {
      int in;
      int out;

      public Person(int in, int out) {
         this.in = in;
         this.out = out;
      }

      @Override
      public int compareTo(Person o) {
         if (this.in == o.in) {
            return this.out - o.out;
         }
         return this.in - o.in;
      }

      @Override
      public String toString() {
         return "Person{" +
               "in=" + in +
               ", out=" + out +
               '}';
      }
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int result = 0;
      int startTime = 72;
      int cnt = 1;

      List<Person> list = new ArrayList<>();

      while (N > 0) {
         int first = in.nextInt();
         int second = in.nextInt();

         list.add(new Person(first, second));
         N--;
      }

      Collections.sort(list);

      for (Person person : list) {
         if (startTime > person.out) {
            cnt++;
            startTime = person.out;
         }
      }

      System.out.println(cnt);

      return ;
   }
}
