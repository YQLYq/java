/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-20 17:56:31
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-20 17:58:39
 */
package day14;

public class Example28 {
  public static int divide(int x, int y) {
    int result = x / y;
    return result;
  }

  public static void main(String[] args) {
    int result = divide(4, 0);
    System.out.println(result);
  }
}