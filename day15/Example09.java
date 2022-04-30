/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-27 11:46:10
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-27 18:49:20
 */
package day15;

public class Example09 {
  public static void main(String[] args) {
    long starttime = System.currentTimeMillis();
    System.out.println(starttime);
    int sum = 0;
    for (int i = 0; i < 1000000000; i++) {
      sum += sum * i;
    }
    long endtime = System.currentTimeMillis();
    System.out.println(endtime);
  }
}