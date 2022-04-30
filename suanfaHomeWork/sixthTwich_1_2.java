/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-16 12:16:36
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-16 12:19:33
 */
package suanfaHomeWork;

import java.util.Scanner;

public class sixthTwich_1_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("输入数列大小");
    int n = scanner.nextInt();
    int t = 0; // 记录数列前一个的值
    int sum = 0;// 记录数列中连续相同的最长整数序列算成一段
    System.out.println("输入数列");
    for (int i = 0; i < n; i++) {
      int a = scanner.nextInt();
      if (a != t) {
        sum++;
      }
      t = a;
    }
    System.out.println(sum);
    scanner.close();
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-04-16 12:16:36
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-04-16 12:16:36
  */
