/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-24 22:10:47
 * @LastEditors: ������
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
        System.out.println("windowOpened--������¼�");

      }

      @Override
      public void windowClosing(WindowEvent e) {
        System.out.println("windowClosing--�������ڹر�");
      }

      @Override
      public void windowClosed(WindowEvent e) {
        System.out.println("windowclosed--����ر��¼�");
      }

      @Override
      public void windowIconified(WindowEvent e) {
        System.out.println("windowIconified--����ͼ�껯�¼�");
      }

      @Override
      public void windowDeiconified(WindowEvent e) {
        System.out.println("windowDeiconified--����ȡ��ͼ�껯�¼�");
      }

      @Override
      public void windowActivated(WindowEvent e) {
        System.out.println("windowActivated--���弤���¼�");
      }

      @Override
      public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactivated--����ͣ���¼�");
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
  * @Autor: ������
  * 
  * @Date: 2022-04-24 22:10:47
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-04-24 22:10:47
  */
