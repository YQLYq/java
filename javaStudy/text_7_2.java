/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-23 13:10:13
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-23 14:13:16
 */
package javaStudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class text_7_2 {
  public static void main(String[] args) throws Exception {
    BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
    String str;
    boolean isFlag = true;
    for (int i = 0; i < 5; i++) {
      str = bw.readLine();
      if (str.equals("12345")) {
        isFlag = false;
        System.out.println("πßœ≤Ω¯»Î”Œœ∑");
        break;
      }
    }
    if (isFlag) {
      System.out.println("√‹¬Î¥ÌŒÛ£¨Ω· ¯”Œœ∑");
      System.exit(0);
    }
  }
}