/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-18 18:29:41
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-18 22:32:29
 */
package suanfaHomeWork;

import java.util.Arrays;

import java.util.Scanner;

public class third_3 {
  public static int count = 0;

  public static void Merage(char a[], int head, int mid, int high) { // 分治
    int i = head;
    int j = mid + 1;
    char aa[] = new char[a.length];
    int k = 0;
    while (i <= mid && j <= high) {
      if ((int) a[i] <= (int) a[j]) {
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
    for (k = 0, i = head; i <= high; k++, i++) {
      a[i] = aa[k];
    }
  }

  public static void MeragePass(char a[], int head, int high) {// 分组
    if (head < high) {
      int mid = (int) (high + head) / 2;
      MeragePass(a, head, mid);
      MeragePass(a, mid + 1, high);
      Merage(a, head, mid, high);
    }
  }

  public static void swap(char a[][], int sum[]) {// 交换 Arrays.binarySearch(a, key)二分查找是要排序的，ArraysList是容器
    while (Arrays.stream(sum).min().getAsInt() != 100) {
      int min = Arrays.stream(sum).min().getAsInt();
      int index = getIndex(sum, min);
      System.out.println(Arrays.toString(a[index]));
      sum[index] = 100;
    }
  }

  public static int getIndex(int sum[], int a) {
    int index;
    for (int i = 0; i < sum.length; i++) {
      if (a == sum[i]) {
        index = i;
        return index;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    int j = scanner.nextInt();
    char a[][] = new char[i][j];
    int sum[] = new int[j];
    for (int k = 0; k < j; k++) {
      a[k] = scanner.next().toCharArray();
    }
    scanner.close();
    for (int k = 0; k < j; k++) {
      char a1[] = a[k].clone();
      MeragePass(a1, 0, i - 1);
      sum[k] = count;
      count = 0;
    }
    System.out.println();
    swap(a, sum);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-18 18:29:41
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-18 18:29:41
  */
