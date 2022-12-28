package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 풀이 약간 참조함
public class 베스트앨범 {

   public static void main(String[] args) {
      String[] genres = {"classic", "pop", "classic", "classic", "pop"};
      int[] plays = {500, 600, 150, 800, 2500};

      solution(genres, plays);

   }

   public static int[] solution(String[] genres, int[] plays) {
      int[] answer = {};
      List<Integer> anList = new ArrayList<>();

      Map<String, Integer> hm = new HashMap<>();
      for (int i = 0; i < genres.length; i++) {
         if (hm.containsKey(genres[i])) {
            hm.replace(genres[i], hm.get(genres[i]) + plays[i]);
         } else {
            hm.put(genres[i], plays[i]);
         }
      }

      List<String> keys = new ArrayList<>();
      for (String s : hm.keySet()) {
         keys.add(s);
      }

      Collections.sort(keys, Comparator.comparingInt(hm::get).reversed());

      for (String key : keys) {
         Map<Integer, Integer> mapp = new HashMap<>();
         List<Integer> bb = new ArrayList<>();

         for (int i = 0; i < genres.length; i++) {
            String type = genres[i];

            if (type.equals(key)) {
               mapp.put(i, plays[i]);
               bb.add(i);
            }
         }

         Collections.sort(bb, Comparator.comparingInt(mapp::get).reversed());

         if (bb.size() == 1) {
            anList.add(bb.get(0));
         } else {
            anList.add(bb.get(0));
            anList.add(bb.get(1));
         }
      }

      answer = anList.stream().mapToInt(s -> s).toArray();

      return answer;
   }
}
