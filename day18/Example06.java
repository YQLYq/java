/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-24 15:03:07
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-24 22:10:39
 */
package day18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

class MyListener implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("用户点击JBtton按钮组件");
  }
}

public class Example06 {
  private static void createAndShowGUI() {
    JFrame f = new JFrame("JFrame");
    f.setSize(300, 300);
    JButton btn = new JButton("按钮");
    btn.addActionListener(new MyListener());
    f.add(btn);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example06::createAndShowGUI);
  }
}