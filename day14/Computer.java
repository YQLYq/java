/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-24 09:43:48
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-24 10:03:37
 */
package day14;

interface USB {
  void turnon();

  void turnoff();
}

class Mouse implements USB {
  public void turnon() {
    System.out.println("鼠标启动了");
  }

  public void turnoff() {
    System.out.println("鼠标关闭了");
  }
}

class KeyBoard implements USB {
  public void turnon() {
    System.out.println("键盘启动了");
  }

  public void turnoff() {
    System.out.println("键盘关闭了");
  }
}

class Mic implements USB {
  public void turnon() {
    System.out.println("麦克风启动了");
  }

  public void turnoff() {
    System.out.println("麦克风关闭了");
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
    System.out.println("计算机开机成功");
  }

  public void powerOff() {
    for (int i = 0; i < a.length; i++) {
      if (a[i] !=null) {
        a[i].turnoff();
      }
    }
    System.out.println("计算机关机");
  }
}
/*
 * @Description:
 * 
 * @Version: 2.0
 * 
 * @Autor: 阳秦林
 * 
 * @Date: 2022-03-24 09:43:48
 * 
 * @LastEditors: 阳秦林
 * 
 * @LastEditTime: 2022-03-24 09:43:48
 */
