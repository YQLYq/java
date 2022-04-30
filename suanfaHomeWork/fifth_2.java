/*
 * @Description: 将棋盘分成四份，找特殊方格的位置，不在则在中心覆盖，以该位置为特殊方格，继续在其位置递归
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-29 19:24:36
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-29 20:21:09
 */
package suanfaHomeWork;

public class fifth_2 {
  public static int a[][] = new int[4][4];
  static int title = 1;

  public static void coverBoard(int tr, int tc, int dr, int dc, int size) {
    if (size == 1) {
      return;
    }
    int t = title++;
    int s = size / 2;
    if (dr < tr + s && dc < tc + s) { // 左上角
      coverBoard(tr, tc, dr, dc, s);
    } else {
      a[tr + s - 1][tc + s - 1] = t;
      coverBoard(tr, tc, tr + s - 1, tc + s - 1, s);
    }

    if (dr < tr + s && dc >= tc + s) {// 右上
      coverBoard(tr, tc + s, dr, dc, s);
    } else {
      a[tr + s - 1][tc + s] = t;
      coverBoard(tr, tc + s, tr + s - 1, tc + s, s);
    }

    if (dr >= tr + s && dc < tc + s) {// 左下
      coverBoard(tr + s, tc, dr, dc, s);
    } else {
      a[tr + s][tc + s - 1] = t;
      coverBoard(tr + s, tc, tr + s, tc + s - 1, s);
    }

    if (dr >= tr + s && dc >= tc + s) {// 右下
      coverBoard(tr + s, tc + s, dr, dc, s);
    } else {
      a[tr + s][tc + s] = t;
      coverBoard(tr + s, tc + s, tr + s, tc + s, s);
    }
  }

  public static void main(String[] args) {
    coverBoard(0, 0, 2, 1, 4);
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-29 19:24:36
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-29 19:24:36
  */
