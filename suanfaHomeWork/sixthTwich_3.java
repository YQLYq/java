/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-16 20:57:04
 * @LastEditors: ������
 * @LastEditTime: 2022-04-16 21:02:47
 */
package suanfaHomeWork;

import java.util.Scanner;

public class sixthTwich_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // �����ж�������С
    int n = 0;
    System.out.println("������������С��");
    while (scanner.hasNextInt()) {
      n = scanner.nextInt();
      if (n >= 2 && n <= 1000) {
        break;
      } else {
        System.out.println("������������С��");
      }
    }
    // �����ж�����
    System.out.println("������������");
    int a[] = new int[n];
    int num = 0;
    int i = 0;
    while (i < n) {
      a[i] = scanner.nextInt();
      if (a[i] <= 10000 && a[i] > 0) {
        i++;
      } else {
        System.out.println("����������������룡");
        i--;
      }
    }
    // �Ƚϲ�ֵ
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