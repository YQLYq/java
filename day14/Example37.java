/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-24 09:30:33
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-24 09:39:24
 */
package day14;

class Person {
  public void finalize() {
    System.out.println("«Â≥˝");
  }
}

public class Example37 {
  public static void recyclegWastel() {
    new Person();
    int i = 1;
    while (i < 10) {
      System.out.println("1");
      i++;
    }
  }

  public static void recyclegWastel2(){
    new Person();
    System.gc();
    int i = 1;
    while(i<10){
      System.out.println("2");
      i++;
    }
  }
  public static void main(String[] args) {
    recyclegWastel();
    recyclegWastel2();
  }
}