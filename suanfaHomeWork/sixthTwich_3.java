/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-16 20:57:04
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-16 21:02:47
 */
package suanfaHomeWork;

import java.util.Scanner;

public class sixthTwich_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 输入判断整数大小
    int n = 0;
    System.out.println("请输入整数大小：");
    while (scanner.hasNextInt()) {
      n = scanner.nextInt();
      if (n >= 2 && n <= 1000) {
        break;
      } else {
        System.out.println("请输入整数大小：");
      }
    }
    // 输入判断整数
    System.out.println("请输入整数：");
    int a[] = new int[n];
    int num = 0;
    int i = 0;
    while (i < n) {
      a[i] = scanner.nextInt();
      if (a[i] <= 10000 && a[i] > 0) {
        i++;
      } else {
        System.out.println("输入错误，请重新输入！");
        i--;
      }
    }
    // 比较差值
    for (int z = 0; z < a.length - 1; z++) {
      for (int j = z + 1; j < a.length; j++) {
        if (a[j] - a[z] == 1) {
          num++;
        }
      }
    }
    System.out.println(num);
    scanner.close();
  }
}