/*
 * @Description: 分治算法排序
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-18 17:47:51
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-18 18:03:23
 */
package suanfaHomeWork;

import java.util.Arrays;

public class third_2_3 {
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

  public static void MeragePass(int a[], int head, int high) {
    if (head < high) {
      int mid = (int) (high + head) / 2;
      MeragePass(a, head, mid);
      MeragePass(a, mid + 1, high);
      Merage(a, head, mid, high);
    }
  }

  public static void main(String[] args) {
    int a[] = { 3, 1, 4, 5, 2 };
    MeragePass(a, 0, 4);
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
  * @Date: 2022-03-18 17:47:51
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-18 17:47:51
  */
