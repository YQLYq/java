/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-26 20:50:46
 * @LastEditors: ������
 * @LastEditTime: 2022-04-26 21:00:40
 */
package day18;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Example15 {
  private static void createAndSHowGUI() {
    JFrame f = new JFrame("����");
    f.setSize(500, 500);
    f.setLocation(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel();
    JComboBox<String> comboBox = new JComboBox<>();
    comboBox.addItem("��ѡ�����");
    comboBox.addItem("����");
    comboBox.addItem("�Ϻ�");
    JTextField textField = new JTextField(20);
    comboBox.addActionListener(e -> {
      String item = (String) comboBox.getSelectedItem();
      if ("��ѡ�����".equals(item)) {
        textField.setText("");
      } else {
        textField.setText("�����ڵĳ���λ" + item);
      }
    });
    panel.add(comboBox);
    panel.add(textField);
    f.add(panel, BorderLayout.PAGE_START);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example15::createAndSHowGUI);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ������
  * 
  * @Date: 2022-04-26 20:50:46
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-04-26 20:50:46
  */
