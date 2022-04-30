/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-23 14:55:59
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-23 15:39:47
 */
package day18;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.*;

public class Example03 {
  private static void createAndShowGUI() {
    JFrame f = new JFrame("BorderLayout");
    f.setLayout(new BorderLayout());
    f.setSize(400, 400);
    f.setLocation(300, 200);
    JButton but1 = new JButton("PAGE_START");
    JButton but2 = new JButton("PAGR_END");
    JButton but3 = new JButton("LINE_START");
    JButton but4 = new JButton("LINE_END");
    JButton but5 = new JButton("CENTER");
    f.add(but1, BorderLayout.PAGE_START);
    f.add(but2, BorderLayout.PAGE_END);
    f.add(but3, BorderLayout.LINE_START);
    f.add(but4, BorderLayout.LINE_END);
    f.add(but5, BorderLayout.CENTER);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example03::createAndShowGUI);
  }
}