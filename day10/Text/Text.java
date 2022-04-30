/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-01-21 18:12:55
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-26 11:41:11
 */

package day10.Text;

public class Text {
  public static void main(String[] args) {
    Text demo = new Text();
    demo.show(new Car() {
      public void run() {
        System.out.println("demo run");
      }
    });
  }

  public void show(Car c) {
    c.run();
  }
}

abstract class Car {
  public void run() {
    System.out.println("car run...");
  }
}