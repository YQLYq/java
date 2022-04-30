/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-19 10:47:52
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-19 13:27:05
 */
package day12;

interface Animal {
  void show();
}

class cat implements Animal {
  public void show() {
    System.out.println("dd");
  }

  public void catShow() {
    System.out.println("das");
  }
}

class dog implements Animal {
  public void show() {
    System.out.println("ss");
  }
}

public class Example17 {

  public static void main(String[] args) {
    Animal an1 = new dog ();
    if (an1 instanceof cat){
      System.out.println("d");
    }else 
    System.out.println("s");
  }
}
/*
 * @Description:
 * 
 * @Version: 2.0
 * 
 * @Autor: —Ù«ÿ¡÷
 * 
 * @Date: 2022-03-19 10:47:52
 * 
 * @LastEditors: —Ù«ÿ¡÷
 * 
 * @LastEditTime: 2022-03-19 10:47:52
 */
