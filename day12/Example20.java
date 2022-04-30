/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-19 17:21:31
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-19 17:38:41
 */
package day12;

class Outer2 {
  static int m = 1;

  static class inner1 {
    void show() {
      System.out.println(m);
    }
  }
}

public class Example20 {
  public static void main(String[] args) {
    Outer2.inner1 inner1 = new Outer2.inner1();
    inner1.show();
  }
}