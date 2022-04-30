/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-27 19:42:52
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-27 19:53:13
 */
package day15;

import java.util.Arrays;

public class Example10 {
  public static void main(String[] args) {
    int a[] = { 1, 23, 4, 556, 7 };
    int b[] = { 1, 8, 745222 };
    System.arraycopy(a, 0, b, 0, 3);
    System.out.println(Arrays.toString(b));
  }
}