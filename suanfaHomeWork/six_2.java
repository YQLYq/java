/*
 * @Description: ���㵽��ף����㲻Ҫ���㣬��Ҫ����
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-05 17:31:02
 * @LastEditors: ������
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
        if (j < 2 * fishSize[i] || j > 10 * fishSize[i]) {// �ж��Ƿ��������� ����10��С��2����true������falseֱ���˳�ѭ��
          isflag = true;
        } else {
          isflag = false;
          break;
        }
        if (fishSize[i] >= 2 * j && fishSize[i] <= 10 * j) {// �ж��Ƿ��������� ����10��С��2����falseֱ���˳�������trrue
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