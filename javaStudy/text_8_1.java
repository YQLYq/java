/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-30 19:32:59
 * @LastEditors: ������
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
    JFrame frame = new JFrame("��һ����ҵ");
    frame.setSize(400, 400);
    frame.setLocation(200, 200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("�˴���ʾ����Ҽ�");
    label.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
          String str = "����x����:" + e.getX() + " y����:" + e.getY();
          label.setText(str);
        }
      }
    });
    label.setFont(new Font("����", 0, 20));
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
 * @Autor: ������
 * 
 * @Date: 2022-04-30 19:32:59
 * 
 * @LastEditors: ������
 * 
 * @LastEditTime: 2022-04-30 19:32:59
 */
