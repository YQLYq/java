/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-16 12:16:36
 * @LastEditors: ������
 * @LastEditTime: 2022-04-16 12:19:33
 */
package suanfaHomeWork;

import java.util.Scanner;

public class sixthTwich_1_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("�������д�С");
    int n = scanner.nextInt();
    int t = 0; // ��¼����ǰһ����ֵ
    int sum = 0;// ��¼������������ͬ��������������һ��
    System.out.println("��������");
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
  * @Autor: ������
  * 
  * @Date: 2022-04-16 12:16:36
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-04-16 12:16:36
  */
