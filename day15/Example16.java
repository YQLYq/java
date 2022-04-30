/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-28 22:10:30
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-29 09:23:59
 */
package day15;

import java.util.Date;

public class Example16 {
  public static void main(String[] args) {
    Date data = new Date();
    System.out.println(data);
    Date date = new Date(System.currentTimeMillis() + 1000);
    System.out.println(date);
  }
}