/*
 * @Description: 函数式接口，FunctionalInterface是表明这个是函数式接口
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-20 11:31:15
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-20 11:38:27
 */
package day12;

@FunctionalInterface
interface Animal13 {
  void show();
}

interface Calucate {
  int sum(int a, int b);
}

public class Example22 {
  public static void main(String[] args) {
    adminShout1(() -> System.out.println("ss"));
    showsum(10, 52, (a, b) -> a + b);
  }

  private static void adminShout1(Animal13 an) {
    an.show();
  }

  private static void showsum(int a, int b, Calucate calucate) {
    System.out.println(calucate.sum(a, b));
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-20 11:31:15
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-20 11:31:15
  */
