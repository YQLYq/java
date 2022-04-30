/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-26 20:35:58
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-26 20:50:26
 */
package day18;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class Example14 {
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
    ButtonGroup group = new ButtonGroup();
    JRadioButton italic = new JRadioButton("ITALC");
    JRadioButton bold = new JRadioButton("BOLD");
    group.add(italic);
    group.add(bold);
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
    SwingUtilities.invokeLater(Example14::createAndShowGUI);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-04-26 20:35:58
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-04-26 20:35:58
  */
