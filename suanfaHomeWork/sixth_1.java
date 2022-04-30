/*
 * @Description: 第一次迭代没有考虑是连续相同的，第二次迭代遇到不同的清零
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-04 23:50:20
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-05 15:06:07
 */
package suanfaHomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class sixth_1 {
  public static int writingBoard(char[][] a) {
    int[] sum = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      sum[i] = 0;
      int white = 0;
      int black = 0;
      for (int j = 0; j < a.length; j++) {
        if (a[j][i] == 'W') {
          white++;
          black = 0;// 如果下一个是黑，那么黑色的数量清零
        } else if (a[j][i] == 'B') {
          black++;
          white = 0;// 如果下一个是白，那么白色的数量清零
        }
      }
      if (white > black) {
        sum[i] = white;
      } else {
        sum[i] = black;
      }
    }
    Arrays.sort(sum);
    return sum[a.length - 1];
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    char[][] a = new char[n][n];
    for (int i = 0; i < n; i++) {
      String s = scanner.next();
      for (int j = 0; j < n; j++) {
        a[i][j] = s.charAt(j);
      }
    }
    System.out.println(writingBoard(a));
    scanner.close();
  }
}
/*
 * @Description:
 * 
 * @Version: 2.0
 * 
 * @Autor: 阳秦林
 * 
 * @Date: 2022-04-04 23:50:20
 * 
 * @LastEditors: 阳秦林
 * 
 * @LastEditTime: 2022-04-04 23:50:20
 */
