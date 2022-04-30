/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-26 18:08:59
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-26 20:35:50
 */
package day18;

import java.awt.BorderLayout;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Example13 {
  private static void createAndShowGUI() {
    JFrame f = new JFrame("窗口");
    f.setLayout(new BorderLayout());
    f.setSize(400, 400);
    f.setLocation(300, 300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("hello world", JLabel.CENTER);
    label.setFont(new Font("宋体", Font.PLAIN, 20));
    JPanel panel = new JPanel();
    JCheckBox italic = new JCheckBox("ITALIC");
    JCheckBox bold = new JCheckBox("BOLD");
    ActionListener listener = new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        int mode = 0;
        if (bold.isSelected()) {
          mode += Font.BOLD;
        }
        if (italic.isSelected()) {
          mode += Font.ITALIC;

        }
        label.setFont(new Font("宋体", mode, 20));
      }
    };
    italic.addActionListener(listener);
    bold.addActionListener(listener);
    panel.add(italic);
    panel.add(bold);
    f.add(label);
    f.add(panel, BorderLayout.PAGE_END);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example13::createAndShowGUI);
  }
}