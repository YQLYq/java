/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-28 18:35:35
 * @LastEditors: ������
 * @LastEditTime: 2022-04-30 18:45:18
 */
package day18.qqText;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class LoginListener implements ActionListener {
  private JComboBox<Object> jco;
  private JPasswordField jpa;
  private JFrame jf;

  public LoginListener(JComboBox<Object> jco, JPasswordField jpa, JFrame jf) {
    super();
    this.jco = jco;
    this.jpa = jpa;
    this.jf = jf;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // ��ȡ��¼�˺ź�����
    String name = (String) jco.getSelectedItem();
    String pwd = new String(jpa.getPassword());
    // �ж�������ȷ
    if (name.equals("123456789") && pwd.equals("123456")) {
      jf.dispose();
      JFrame jfn = new JFrame();// ����һ���µĴ���
      jfn.setSize(289, 687);
      jfn.setLocation(800, 100);
      jfn.setUndecorated(true);
      jfn.setResizable(true);// ���ô����Ƿ���Ըı��С
      jfn.setVisible(true);
      // ΪQQ��ӱ������˳���ť
      JPanel panel = new JPanel();
      panel.setLayout(null);
      panel.setPreferredSize(new Dimension(0, 140));
      ImageIcon image = new ImageIcon("day18\\images\\qqSuccess.jpg");
      JLabel background = new JLabel(image);
      background.setBounds(0, 0, 289, 687);
      panel.add(background);
      // �����˳���ť
      JButton out = new JButton(new ImageIcon("day18\\images\\close2_normal.jpg"));
      out.setBounds(265, 0, 26, 26);
      out.setRolloverIcon(new ImageIcon("day18\\images\\close2_hover.jpg"));
      out.setBorderPainted(false);// ���ð�ť�Ƿ���ʾ�߿�
      panel.add(out);
      jfn.add(panel);
      out.addActionListener(event -> jfn.dispose());
    } else {
      // ������󵯴�
      JOptionPane.showMessageDialog(jf, "�˺Ż��������");
    }
  }
}