/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-07 09:50:46
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-07 09:51:53
 */
package javaStudy;

import java.util.Random;

public class text_5_2 {
  public static void main(String[] args) {
    Random random = new Random();
    for (int i = 0; i < 5; i++) {
      int num = 20 + random.nextInt(11);
      System.out.println(num);
    }
  }
}