/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-19 17:54:37
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-19 21:47:29
 */
package javaStudy;

interface Shape {
  abstract double area(double a);
}

class Square implements Shape {
  public double area(double a) {
    return a * a;
  }
}

class Circle implements Shape {
  public double area(double a) {
    return Math.PI * a * a;
  }
}

public class text4_5_2 {
  public static void main(String[] args) {
    Square square = new Square();
    Circle circle = new Circle();
    System.out.println(square.area(2));
    System.out.println(circle.area(3));
  }

  
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-03-19 17:54:37
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-03-19 17:54:37
  */
