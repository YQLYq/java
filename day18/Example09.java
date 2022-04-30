/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-25 17:48:52
 * @LastEditors: ������
 * @LastEditTime: 2022-04-26 15:08:15
 */
package day18;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Example09 {
  private static void createAndShowGUI() {
    JFrame f = new JFrame("KeyEvent");
    f.setLayout(new FlowLayout());
    f.setSize(400, 300);
    f.setLocation(300, 300);
    JTextField tf = new JTextField(30);
    f.add(tf);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tf.addKeyListener(new KeyAdapter(){

  @Override
  public void keyPressed(KeyEvent e) {
    char keyChar = e.getKeyChar();
    int keyCode = e.getKeyCode();
    System.out.println("��������Ϊ" + keyChar);
    System.out.println("�����ַ�Ϊ" + keyCode);
  }

  });}

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example09::createAndShowGUI);
  }
}