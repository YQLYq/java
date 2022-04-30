/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-05 14:19:10
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-05 15:04:44
 */
package suanfaHomeWork;

import java.util.Scanner;

public class sixth_1_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int sum = 0;
    String[] s = new String[n];
    for (int i = 0; i < s.length; i++) {
      s[i] = scanner.next();
    }
    for (int i = 0; i < s.length; i++) {
      int max = 1;
      for (int j = 0; j < s.length - 1; j++) {
        if (s[j].charAt(i) == s[j + 1].charAt(i)) {
          max++;
          sum = Math.max(sum, max);
        } else {
          max = 1;
        }
      }
    }
    System.out.println(sum);
    scanner.close();
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-05 14:19:10
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-05 14:19:10
  */
