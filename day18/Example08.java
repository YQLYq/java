/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-25 12:55:11
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-25 17:23:08
 */
package day18;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Example08 {
  private static void createAndShowGUI() {
    JFrame f = new JFrame("MouseEvent");
    f.setLayout(new FlowLayout());
    f.setSize(300, 300);
    f.setLocation(300, 200);
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
    JButton btf = new JButton("JButton");
    f.add(btf);
    btf.addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked--鼠标完成单击事件");
        if (e.getButton() == MouseEvent.BUTTON1) {
          System.out.println("左");
        }
        if (e.getButton() == MouseEvent.BUTTON2) {
          System.out.println("中");
        }
        if (e.getButton() == MouseEvent.BUTTON3) {
          System.out.println("右");
        }
        System.out.println(e.getClickCount());
      }

      @Override
      public void mousePressed(MouseEvent e) {
        System.out.println("鼠标按下事件");
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased--鼠标放开事件");
      }

      @Override
      public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered--鼠标进入按钮区域事件");
      }

      @Override
      public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited--鼠标退出按钮事件");
      }

    });
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example08::createAndShowGUI);
  }
}