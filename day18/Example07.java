/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-24 22:10:47
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-30 19:23:20
 */
package day18;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Example07 {
  private static void createAndShowGUI() {
    JFrame f = new JFrame("WindowText");
    f.setSize(300, 300);
    f.setLocation(300, 300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.addWindowListener(new WindowListener() {
      @Override
      public void windowOpened(WindowEvent e) {
        System.out.println("windowOpened--窗体打开事件");

      }

      @Override
      public void windowClosing(WindowEvent e) {
        System.out.println("windowClosing--窗体正在关闭");
      }

      @Override
      public void windowClosed(WindowEvent e) {
        System.out.println("windowclosed--窗体关闭事件");
      }

      @Override
      public void windowIconified(WindowEvent e) {
        System.out.println("windowIconified--窗体图标化事件");
      }

      @Override
      public void windowDeiconified(WindowEvent e) {
        System.out.println("windowDeiconified--窗体取消图标化事件");
      }

      @Override
      public void windowActivated(WindowEvent e) {
        System.out.println("windowActivated--窗体激活事件");
      }

      @Override
      public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactivated--窗体停用事件");
      }
    });
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example07::createAndShowGUI);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-04-24 22:10:47
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-04-24 22:10:47
  */
