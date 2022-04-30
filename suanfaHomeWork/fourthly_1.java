/*
 * @Description: 分治算法：
1、将原数组排序，找出中位数假定为众数，并且确定中位数的个数，记录左右两边的下标。这样，把数组分为了左右两部分。
2、如果左边部分的个数大于中位数的个数，则遍历左边，右边同理。
3、若左边剩余元素还大于重数，则有可能会存在更大的众数重数，递归寻找。
4、若右边剩余元素还大于重数，则有可能会存在更大的众数重数，递归寻找。
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-21 19:01:45
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-22 20:58:52
 */
package suanfaHomeWork;

public class fourthly_1 {
  private static int maxsum = 0;
  private static int maxzhong = 0;

  public static void findMid(int a[], int head, int end) { // 有序查找
    int mid = (head + end) / 2;
    int i = mid - 1;
    int j = mid + 1;
    int sum = 1;
    while (a[mid] == a[i] && i >= head) {
      sum++;
      i--;
    }
    while (a[mid] == a[j] && j <= end) {
      sum++;
      j++;
    }
    if (sum == maxsum && a[mid] < maxzhong) {
      maxsum = sum;
      maxzhong = a[mid];
    }
    if (sum > maxsum) {
      maxsum = sum;
      maxzhong = a[mid];
    }
    if (i - head + 1 > maxsum) {
      findMid(a, head, i);
    }
    if (end - j + 1 > maxsum) {
      findMid(a, j, end);
    }
  }

  public static void main(String[] args) {
    int a[] = { 1, 2, 2, 2, 3, 5 };
    findMid(a, 0, a.length - 1);
    System.out.println("该数组的众数为" + maxzhong + "重数为" + maxsum);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-21 19:01:45
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-21 19:01:46
  */
