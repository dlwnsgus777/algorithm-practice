package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 촌수계산 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static int n;
   static int[][] family;
   static boolean[] visited;
   static int count = -1;
   static int start;
   static int target;
   public static void main(String[] args) throws IOException {
      n = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());

      family = new int[n + 1][n + 1];
      visited = new boolean[n + 1];

      start = Integer.parseInt(st.nextToken());
      target = Integer.parseInt(st.nextToken());

      st = new StringTokenizer(br.readLine());

      int m = Integer.parseInt(st.nextToken());

      for (int i = 1; i < m + 1; i++) {
         st = new StringTokenizer(br.readLine());
         int x = Integer.parseInt(st.nextToken());
         int y = Integer.parseInt(st.nextToken());
         family[x][y] = family[y][x] = 1;
      }

//      System.out.println(start + "     asdasd    " + target);

      dfs(start, 0);


      System.out.println(count);

      br.close();
   }

   private static void dfs(int start, int cnt) {
      visited[start] = true;

      if (start == target) {
         count = cnt;
         return;
      }

      System.out.print(start +  " , cnt: " + cnt + "  -> ");

      for (int i = 1; i < family.length; i++) {
//         System.out.println("start : " + start + " index : " + i);
         if (family[start][i] == 1 && !visited[i]) {
            dfs(i, cnt + 1);
         }
      }
   }
}
