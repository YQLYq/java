/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-24 09:43:48
 * @LastEditors: ������
 * @LastEditTime: 2022-03-24 10:03:37
 */
package day14;

interface USB {
  void turnon();

  void turnoff();
}

class Mouse implements USB {
  public void turnon() {
    System.out.println("���������");
  }

  public void turnoff() {
    System.out.println("���ر���");
  }
}

class KeyBoard implements USB {
  public void turnon() {
    System.out.println("����������");
  }

  public void turnoff() {
    System.out.println("���̹ر���");
  }
}

class Mic implements USB {
  public void turnon() {
    System.out.println("��˷�������");
  }

  public void turnoff() {
    System.out.println("��˷�ر���");
  }
}

public class Computer {
  public static USB a[] = new USB[5];
  public static int i = 0;

  public void add(USB usb) {
    a[i] = usb;
    i++;
  }

  public void poweron() {
    for (int i = 0; i < a.length; i++) {
      if (a[i] != null) {
        a[i].turnon();
      }
    }
    System.out.println("����������ɹ�");
  }

  public void powerOff() {
    for (int i = 0; i < a.length; i++) {
      if (a[i] !=null) {
        a[i].turnoff();
      }
    }
    System.out.println("������ػ�");
  }
}
/*
 * @Description:
 * 
 * @Version: 2.0
 * 
 * @Autor: ������
 * 
 * @Date: 2022-03-24 09:43:48
 * 
 * @LastEditors: ������
 * 
 * @LastEditTime: 2022-03-24 09:43:48
 */
