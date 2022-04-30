/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-19 14:07:12
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-19 14:20:42
 */
package day12;



class Outer1 {
  int m = 0;

  void show() {
    System.out.println("外部类");
  }

  void text() {
    class Inner {
      int n = 1;

      void show() {
        System.out.println("局部" + m);
      }
    }
    Inner inner = new Inner();
    inner.show();
    System.out.println("n" + inner.n);
  }

}

public class Example19 {
  public static void main(String[] args) {
    Outer1 outer1 = new Outer1();
    outer1.text();
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-19 14:07:12
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-19 14:07:12
  */
