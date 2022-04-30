/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-30 19:32:59
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-30 20:13:11
 */
package javaStudy;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class text_8_1 {
  public static void createAndShow() {
    JFrame frame = new JFrame("第一个作业");
    frame.setSize(400, 400);
    frame.setLocation(200, 200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("此处显示鼠标右键");
    label.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
          String str = "鼠标的x坐标:" + e.getX() + " y坐标:" + e.getY();
          label.setText(str);
        }
      }
    });
    label.setFont(new Font("宋体", 0, 20));
    frame.setLayout(new BorderLayout());
    frame.add(label, BorderLayout.NORTH);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(text_8_1::createAndShow);
  }
}
/*
 * @Description:
 * 
 * @Version: 2.0
 * 
 * @Autor: 阳秦林
 * 
 * @Date: 2022-04-30 19:32:59
 * 
 * @LastEditors: 阳秦林
 * 
 * @LastEditTime: 2022-04-30 19:32:59
 */
