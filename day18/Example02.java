/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-23 14:21:46
 * @LastEditors: ������
 * @LastEditTime: 2022-04-23 14:55:47
 */
package day18;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Example02 {
  private static void createAndShowGUI1() {
    JFrame frame = new JFrame("JFrame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(350, 350);
    frame.setVisible(true);
    JDialog dialog = new JDialog(frame, "JDialog�Ի���", true);
    dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
    dialog.setSize(200, 210);
    dialog.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example02::createAndShowGUI1);
  }
}