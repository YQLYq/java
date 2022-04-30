/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-23 15:48:52
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-24 14:58:38
 */
package day18;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.*;

public class Example05 {
  private static void createAndShowGUI() {
    JFrame f = new JFrame("GridLayout");
    f.setLayout(new GridLayout(3, 3));
    f.setSize(300, 300);
    f.setLocation(300, 300);
    for (int i = 0; i < 9; i++) {
      Button btn = new Button("btn" + i);
      f.add(btn);
    }
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example05::createAndShowGUI);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-23 15:48:52
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-23 15:48:52
  */
