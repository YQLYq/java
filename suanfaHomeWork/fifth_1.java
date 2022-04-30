/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ÑôÇØÁÖ
 * @Date: 2022-03-29 09:35:49
 * @LastEditors: ÑôÇØÁÖ
 * @LastEditTime: 2022-03-29 16:44:12
 */
package suanfaHomeWork;

public class fifth_1 {
  public static void findCounterfeitMoney(int a[], int head, int end) {
    int mid = (end + head) / 2;
    int leftsum = add(a, head, mid);
    int righsum = add(a, mid + 1, end);
    if (mid == head || mid == end) { // µ½±ß½çÅĞ¶Ï
      if (leftsum > righsum) {
        System.out.println("¼Ù±ÒµÄÎ»ÖÃÔÚµÚ" + (end + 1));
      } else if (righsum > leftsum) {
        System.out.println("¼Ù±ÒµÄÎ»ÖÃÔÚµÚ" + (head + 1));
      }
      return;
    }
    if (leftsum > righsum) { // ÅĞ¶Ï¼Ù±ÒÔÚÄÄÒ»°ë
      findCounterfeitMoney(a, mid + 1, end);
    } else if (righsum > leftsum) {
      findCounterfeitMoney(a, head, mid);
    } else {
      return;
    }

  }

  public static int add(int a[], int head, int end) {
    int sum = 0;
    for (int i = head; i <= end; i++) {
      sum += a[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int a[] = { 2, 2, 2, 2, 2, 2, 2, 1 };
    findCounterfeitMoney(a, 0, a.length - 1);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ÑôÇØÁÖ
  * 
  * @Date: 2022-03-29 09:35:49
  * 
  * @LastEditors: ÑôÇØÁÖ
  * 
  * @LastEditTime: 2022-03-29 09:35:49
  */
