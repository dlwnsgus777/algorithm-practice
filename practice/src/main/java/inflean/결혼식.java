package inflean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 결혼식 {
   public static class Person implements Comparable<Person> {
      int in;
      char state;

      public Person(int in, char state) {
         this.in = in;
         this.state = state;
      }

      @Override
      public int compareTo(Person o) {
         if (this.in == o.in) {
            return this.state - o.state;
         }
         return this.in - o.in;
      }
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int result = -1;
      int cnt = 0;

      List<Person> list = new ArrayList<>();

      while (N > 0) {
         int first = in.nextInt();
         int second = in.nextInt();

         list.add(new Person(first, 's'));
         list.add(new Person(second, 'e'));
         N--;
      }

      Collections.sort(list);

      for (Person person : list) {
         if (person.state == 's') {
            cnt++;
         } else {
            result = Math.max(result, cnt);
            cnt--;
         }
      }

      System.out.println(result);

      return ;
   }
}
