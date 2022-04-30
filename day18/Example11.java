/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-26 15:51:13
 * @LastEditors: ������
 * @LastEditTime: 2022-04-26 17:36:04
 */
package day18;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Example11 {
  private static void createAndShowGUI() {
    JFrame f = new JFrame("���촰��");
    f.setLayout(new BorderLayout());
    f.setSize(300, 300);
    f.setLocation(300, 300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTextArea showArea = new JTextArea(12, 34);
    JScrollPane scrollPane = new JScrollPane(showArea);
    showArea.setEditable(false);
    JTextField inputField = new JTextField(20);
    JButton btn = new JButton("����");
    btn.addActionListener(e -> {
      String content = inputField.getText();
      if (content != null && !content.trim().equals("")) {
        showArea.append("������Ϣ" + content + "\n");
      } else {
        showArea.append("����Ϊ��");
      }
    });
    JPanel panel = new JPanel();
    JLabel label = new JLabel("������Ϣ");
    panel.add(label);
    panel.add(inputField);
    panel.add(btn);
    f.add(scrollPane, BorderLayout.PAGE_START);
    f.add(panel, BorderLayout.PAGE_END);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example11::createAndShowGUI);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ������
  * 
  * @Date: 2022-04-26 15:51:13
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-04-26 15:51:13
  */
