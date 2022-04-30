/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-19 13:39:37
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-19 14:02:50
 */
package day12;

class Outer {
  int m = 0;

  void text1() {
    System.out.println("外部类");
  }

  class Inter {
    int n = 1;

    void show() {
      System.out.println("Outer" + m);
    }

    void shown() {
      System.out.println("Inter" + n);
    }

    void text4() {
      NNn nn = new NNn();
      nn.show();
      nn.show();
    }

    class NNn {
      int s = 3;

      void show() {
        System.out.println("NNn" + n);
      }
    }
  }

  void text2() {
    Inter inter = new Inter();
    inter.show();
    inter.text4();
  }
}

public class Example18 {
  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.text1();
    outer.text2();
    Outer.Inter inter =  outer.new Inter();
    Outer.Inter.NNn nn = outer.new Inter().new NNn();
    inter.text4();
    inter.shown();
    inter.show();
    nn.show();
  }
}
/*
 * @Description:
 * 
 * @Version: 2.0
 * 
 * @Autor: 阳秦林
 * 
 * @Date: 2022-03-19 13:39:37
 * 
 * @LastEditors: 阳秦林
 * 
 * @LastEditTime: 2022-03-19 13:39:37
 */
