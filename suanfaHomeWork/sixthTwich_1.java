/*
 * @Description: 给定一个整数数列，数列中连续相同的最长整数序列算成一段，问数列中共有多少段？
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-16 11:56:22
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-16 12:15:56
 */

package suanfaHomeWork;

import java.util.Scanner;

public class sixthTwich_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("输入数列大小");
    int n = scanner.nextInt();
    int a[] = new int[n];
    System.out.println("输入数列");
    for (int j = 0; j < a.length; j++) {
      a[j] = scanner.nextInt();
    }
    scanner.close();
    judgeField(a);
  }

  //判断字段长度
  public static void judgeField(int a[]) {
    int sum = 1;
    for (int i = 0; i < a.length - 1; i++) {
      int j = i + 1;
      if (a[i] != a[j]) {
        sum++;
      }
    }
    System.out.println(sum);
  }
}