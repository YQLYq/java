/*
 * @Description: �����㷨��
1����ԭ���������ҳ���λ���ٶ�Ϊ����������ȷ����λ���ĸ�������¼�������ߵ��±ꡣ�������������Ϊ�����������֡�
2�������߲��ֵĸ���������λ���ĸ������������ߣ��ұ�ͬ��
3�������ʣ��Ԫ�ػ��������������п��ܻ���ڸ���������������ݹ�Ѱ�ҡ�
4�����ұ�ʣ��Ԫ�ػ��������������п��ܻ���ڸ���������������ݹ�Ѱ�ҡ�
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-21 19:01:45
 * @LastEditors: ������
 * @LastEditTime: 2022-03-22 20:58:52
 */
package suanfaHomeWork;

public class fourthly_1 {
  private static int maxsum = 0;
  private static int maxzhong = 0;

  public static void findMid(int a[], int head, int end) { // �������
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
    System.out.println("�����������Ϊ" + maxzhong + "����Ϊ" + maxsum);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ������
  * 
  * @Date: 2022-03-21 19:01:45
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-03-21 19:01:46
  */
