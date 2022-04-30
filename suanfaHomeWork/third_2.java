/*
 * @Description: 分治算法排序
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-18 15:35:09
 * @LastEditors: 阳秦林
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

  public static void Grouping(int a[]) {// 分组
    if (a.length > 1) {
      int[] left = around(a, 0);
      int[] right = around(a, 1);
      Grouping(left);
      Grouping(right);
      countResult(a, left, right);
    }
  }

  // 不断分组，直到两边只有一个
  public static int[] around(int a[], int isFlag) {
    int result[];
    if (isFlag == 0) { // 返回数组A的左半边
      result = new int[a.length / 2];
      for (int i = 0; i < a.length / 2; i++) {
        result[i] = a[i];
      }
    } else { // 右边
      result = new int[a.length - a.length / 2];
      for (int i = 0; i < a.length - a.length / 2; i++) {
        result[i] = a[a.length / 2 + i];
      }
    }
    return result;
  }

  public static void countResult(int a[], int left[], int right[]) { // 计数
    int len = 0;
    int i = 0;
    int j = 0;
    int lenL = left.length;
    int lenR = right.length;
    while (i < lenL && j < lenR) {
      if (left[i] > right[j]) {
        a[len++] = right[j++]; // 将rightA[j]放在leftA[i]元素之前，那么leftA[i]之后lenL - i个元素均大于rightA[j]
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
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-18 15:35:09
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-18 15:35:09
  */
