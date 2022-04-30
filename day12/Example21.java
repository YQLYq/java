/*
 * @Description: �����ڲ��� �� lambda
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-19 17:44:05
 * @LastEditors: ������
 * @LastEditTime: 2022-03-20 11:24:35
 */
package day12;

interface Animal12 {
  void show();
}

public class Example21 {
  public static void main(String[] args) {
    adminShout(new Animal12() {
      public void show() {
        System.out.println("ddd");
      }
    });
    adminShout(() -> System.out.println("sss"));
  }

  public static void adminShout(Animal12 an) {
    an.show();
  }
}