/*
 * @Description: ����һ���������У�������������ͬ��������������һ�Σ��������й��ж��ٶΣ�
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-16 11:56:22
 * @LastEditors: ������
 * @LastEditTime: 2022-04-16 12:15:56
 */

package suanfaHomeWork;

import java.util.Scanner;

public class sixthTwich_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("�������д�С");
    int n = scanner.nextInt();
    int a[] = new int[n];
    System.out.println("��������");
    for (int j = 0; j < a.length; j++) {
      a[j] = scanner.nextInt();
    }
    scanner.close();
    judgeField(a);
  }

  //�ж��ֶγ���
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