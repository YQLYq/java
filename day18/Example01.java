/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-23 14:14:11
 * @LastEditors: ������
 * @LastEditTime: 2022-04-23 14:18:08
 */
package day18;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Example01 {
  private static void createAndShowGUi() {
    JFrame frame = new JFrame("��һ������");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(250, 150);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example01::createAndShowGUi);
  }
}
/*
 * @Description:
 * 
 * @Version: 2.0
 * 
 * @Autor: ������
 * 
 * @Date: 2022-04-23 14:14:11
 * 
 * @LastEditors: ������
 * 
 * @LastEditTime: 2022-04-23 14:14:11
 */
