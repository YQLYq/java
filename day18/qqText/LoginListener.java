/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-28 18:35:35
 * @LastEditors: 阳秦林
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
    // 获取登录账号和密码
    String name = (String) jco.getSelectedItem();
    String pwd = new String(jpa.getPassword());
    // 判断密码正确
    if (name.equals("123456789") && pwd.equals("123456")) {
      jf.dispose();
      JFrame jfn = new JFrame();// 创建一个新的窗口
      jfn.setSize(289, 687);
      jfn.setLocation(800, 100);
      jfn.setUndecorated(true);
      jfn.setResizable(true);// 设置窗口是否可以改变大小
      jfn.setVisible(true);
      // 为QQ添加背景和退出按钮
      JPanel panel = new JPanel();
      panel.setLayout(null);
      panel.setPreferredSize(new Dimension(0, 140));
      ImageIcon image = new ImageIcon("day18\\images\\qqSuccess.jpg");
      JLabel background = new JLabel(image);
      background.setBounds(0, 0, 289, 687);
      panel.add(background);
      // 创建退出按钮
      JButton out = new JButton(new ImageIcon("day18\\images\\close2_normal.jpg"));
      out.setBounds(265, 0, 26, 26);
      out.setRolloverIcon(new ImageIcon("day18\\images\\close2_hover.jpg"));
      out.setBorderPainted(false);// 设置按钮是否显示边框
      panel.add(out);
      jfn.add(panel);
      out.addActionListener(event -> jfn.dispose());
    } else {
      // 密码错误弹窗
      JOptionPane.showMessageDialog(jf, "账号或密码错误！");
    }
  }
}