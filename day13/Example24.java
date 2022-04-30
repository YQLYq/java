/*
 * @Description: 类名引用静态方法
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-20 11:53:36
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-20 12:09:06
 */
package day13;

@FunctionalInterface
interface Calucate {
  int calc(int num);
}

class Math {
  public static int abs(int num) {
    if (num < 0) {
      return -num;
    } else {
      return num;
    }
  }
}

public class Example24 {
  private static void printAbs(int num, Calucate calucate) {
    System.out.println(calucate.calc(num));
  }

  public static void main(String[] args) {
    printAbs(-10, n -> Math.abs(n)); // lambda表达式
    printAbs(-10, Math::abs);// 方法引用
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-20 11:53:36
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-20 11:53:36
  */
