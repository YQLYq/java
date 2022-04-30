/*
 * @Description: 放鱼到鱼缸，满足不要吃鱼，不要被吃
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-05 17:31:02
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-05 22:24:21
 */
package suanfaHomeWork;

import java.util.Scanner;

public class six_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int minSize = scanner.nextInt();
    int maxSize = scanner.nextInt();
    int sum = 0;
    boolean isflag = false;
    int n = scanner.nextInt();
    int[] fishSize = new int[n];
    for (int i = 0; i < fishSize.length; i++) {
      fishSize[i] = scanner.nextInt();
    }
    for (int j = minSize; j <= maxSize; j++) {
      for (int i = 0; i < fishSize.length; i++) {
        if (j < 2 * fishSize[i] || j > 10 * fishSize[i]) {// 判断是否满足条件 大于10倍小于2倍则true，否则false直接退出循环
          isflag = true;
        } else {
          isflag = false;
          break;
        }
        if (fishSize[i] >= 2 * j && fishSize[i] <= 10 * j) {// 判断是否满足条件 大于10倍小于2倍则false直接退出，否则trrue
          isflag = false;
          break;
        } else {
          isflag = true;
        }
      }
      if (isflag) {
        sum++;
      }
    }
    System.out.println(sum);
    scanner.close();
    System.out.println();
  }
}