/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-23 15:40:34
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-23 15:48:37
 */
package day18;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.*;

public class Example04 {
  private static void createAndShowGUI() {
    JFrame f = new JFrame("FlowLayout");
    f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
    f.setSize(400, 400);
    f.setLocation(300, 300);
    f.add(new JButton("1"));
    f.add(new JButton("1"));
    f.add(new JButton("1"));
    f.add(new JButton("1"));
    f.add(new JButton("1"));
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example04::createAndShowGUI);
  }
}