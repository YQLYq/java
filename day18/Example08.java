/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-25 12:55:11
 * @LastEditors: ������
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
    JButton btf = new JButton("JButton");
    f.add(btf);
    btf.addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked--�����ɵ����¼�");
        if (e.getButton() == MouseEvent.BUTTON1) {
          System.out.println("��");
        }
        if (e.getButton() == MouseEvent.BUTTON2) {
          System.out.println("��");
        }
        if (e.getButton() == MouseEvent.BUTTON3) {
          System.out.println("��");
        }
        System.out.println(e.getClickCount());
      }

      @Override
      public void mousePressed(MouseEvent e) {
        System.out.println("��갴���¼�");
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased--���ſ��¼�");
      }

      @Override
      public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered--�����밴ť�����¼�");
      }

      @Override
      public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited--����˳���ť�¼�");
      }

    });
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example08::createAndShowGUI);
  }
}