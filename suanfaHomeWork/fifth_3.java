/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-29 20:35:09
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-29 20:44:09
 */
package suanfaHomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class fifth_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int x[] = new int[num];
    int y[] = new int[num];
    int c[] = new int[num];
    for (int i = 0; i < x.length; i++) {
      x[i] = scanner.nextInt();
    }
    for (int i = 0; i < x.length; i++) {
      y[i] = scanner.nextInt();
    }
    for (int i = 0; i < x.length; i++) {
      c[i] = x[i] + y[i] - 2;
    }
    Arrays.sort(c);
    System.out.println(c[0]);
    scanner.close();
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-03-29 20:35:09
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-03-29 20:35:09
  */
