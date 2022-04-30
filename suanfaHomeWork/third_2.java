/*
 * @Description: �����㷨����
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-18 15:35:09
 * @LastEditors: ������
 * @LastEditTime: 2022-03-18 18:03:58
 */
package suanfaHomeWork;

import java.util.Arrays;

public class third_2 {
  public static void main(String[] args) {
    int a[] = { 3, 1, 4, 5, 2 };
    Grouping(a);
    System.out.println(Arrays.toString(a));
  }

  public static void Grouping(int a[]) {// ����
    if (a.length > 1) {
      int[] left = around(a, 0);
      int[] right = around(a, 1);
      Grouping(left);
      Grouping(right);
      countResult(a, left, right);
    }
  }

  // ���Ϸ��飬ֱ������ֻ��һ��
  public static int[] around(int a[], int isFlag) {
    int result[];
    if (isFlag == 0) { // ��������A������
      result = new int[a.length / 2];
      for (int i = 0; i < a.length / 2; i++) {
        result[i] = a[i];
      }
    } else { // �ұ�
      result = new int[a.length - a.length / 2];
      for (int i = 0; i < a.length - a.length / 2; i++) {
        result[i] = a[a.length / 2 + i];
      }
    }
    return result;
  }

  public static void countResult(int a[], int left[], int right[]) { // ����
    int len = 0;
    int i = 0;
    int j = 0;
    int lenL = left.length;
    int lenR = right.length;
    while (i < lenL && j < lenR) {
      if (left[i] > right[j]) {
        a[len++] = right[j++]; // ��rightA[j]����leftA[i]Ԫ��֮ǰ����ôleftA[i]֮��lenL - i��Ԫ�ؾ�����rightA[j]
      } else {
        a[len++] = left[i++];
      }
    }
    while (i < lenL)
      a[len++] = left[i++];
    while (j < lenR)
      a[len++] = right[j++];
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ������
  * 
  * @Date: 2022-03-18 15:35:09
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-03-18 15:35:09
  */
