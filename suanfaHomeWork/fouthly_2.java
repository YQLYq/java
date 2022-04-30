/*
 * @Description: 先找到第一个大于等于c的数
 *               再一一对前面的对比
                当等于的时，用第二个大于c的继续对比
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-22 21:05:09
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-22 22:47:00
 */
package suanfaHomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class fouthly_2 {
  public static int findC(int a[], int c) {
    Arrays.sort(a);
    int k = -1;
    int sum = 0;
    int i = 0;
    int m = a.length - 1;
    for (int j = 0; j < a.length; j++) {
      if (a[j] >= c) {
        k = j;
        break;
      }
    }
    if (k == -1) {
      return 0;
    }
    while (i <= k && k <= m) {
      if (a[k] - a[i] == c) {
        sum++;
      }
      i++;
      if (i == k) {
        k++;
        i = 0;
      }
    }

    return sum;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int c = scanner.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = scanner.nextInt();
    }
    scanner.close();
    System.out.println(findC(a, c));
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-22 21:05:09
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-22 21:05:09
  */
