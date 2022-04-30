/*
 * @Description: 分治算法排序
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-18 15:57:50
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-18 18:03:45
 */
package suanfaHomeWork;

import java.util.Arrays;

public class third_2_2 {
  public static int count = 0;

  public static void Merage(int a[], int low, int mid, int high) {
    int aa[] = new int[a.length];
    int i = low;
    int j = mid + 1;
    int k = 0;
    while (i <= mid && j <= high) {
      if (a[i] <= a[j]) {
        aa[k++] = a[i++]; // 将rightA[j]放在leftA[i]元素之前，那么leftA[i]之后lenL - i个元素均大于rightA[j]
      } else {
        aa[k++] = a[j++];
        count += mid - i + 1;
      }
    }
    while (i <= mid)
      aa[k++] = a[i++];
    while (j <= high)
      aa[k++] = a[j++];
    for (k = 0, i = low; i <= high; k++, i++) {
      a[i] = aa[k];
    }
  }

  public static void MeragePass(int a[], int length, int n) {
    int i;
    for (i = 0; i + 2 * length - 1 < n; i = i + 2 * length) {
      Merage(a, i, i + length - 1, i + 2 * length - 1);
    }
    if (i + length - 1 < n) {
      Merage(a, i, i + length - 1, n - 1);
    }
  }

  public static void MerageSort(int a[]) {
    int length;
    for (length = 1; length < a.length; length = 2 * length)
      MeragePass(a, length, a.length);
  }

  public static void main(String[] args) {
    int a[] = { 3, 1, 4, 5, 2 };
    MerageSort(a);
    System.out.println(Arrays.toString(a));
    System.out.println(count);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-18 15:57:50
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-18 15:57:50
  */
