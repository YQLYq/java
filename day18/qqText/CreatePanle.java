/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-28 10:13:55
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-30 14:40:51
 */
package day18.qqText;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class CreatePanle {
  private static LoginListener ll = null;

  // 创建顶部面板
  public static JPanel CreateNorPanel(JFrame jf) {
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setPreferredSize(new Dimension(0, 140));
    ImageIcon image = new ImageIcon("day18/images/back.jpg");
    JLabel background = new JLabel(image);
    background.setBounds(0, 0, 426, image.getIconHeight());
    panel.add(background);
    JButton out = new JButton(new ImageIcon("day18/images/close_normal.jpg"));
    out.setBounds(403, 0, 26, 26);
    out.setRolloverIcon(new ImageIcon("day18/images/close_hover.jpg"));
    out.setBorderPainted(false);
    out.addActionListener(e -> jf.dispose());
    panel.add(out);
    return panel;

  }

  // 创建左部面板
  public static JPanel CreateWestPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setPreferredSize(new Dimension(130, 0));
    ImageIcon image = new ImageIcon("day18/images/qq.jpg");
    JLabel background = new JLabel(image);
    background.setBounds(0, 0, 120, 110);
    panel.add(background);
    return panel;
  }

  // 创建中部面板
  public static JPanel CreateCenterPanel(JFrame jf) {
    JPanel panel = new JPanel();
    panel.setLayout(null);
    // 创建账号框
    String str[] = { "123456789", "234567891", "345678912" };
    JComboBox<Object> jcoCenter = new JComboBox<>(str);
    panel.add(jcoCenter);
    jcoCenter.setEditable(true);// 可以更改
    jcoCenter.setBounds(0, 15, 175, 30);
    jcoCenter.setFont(new Font("Calibri", 0, 13));// 字体
    // 创建密码框
    JPasswordField jpaCenter = new JPasswordField();
    jpaCenter.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
    jpaCenter.setBounds(0, 44, 175, 30);
    jpaCenter.setPreferredSize(new Dimension(185, 25));
    panel.add(jpaCenter);
    // 键盘图
    ImageIcon image = new ImageIcon("day18/images/keyboard.jpg");
    JButton jbu = new JButton(image);
    jbu.setPreferredSize(new Dimension(22, 20));
    jbu.setBorderPainted(false);
    jpaCenter.add(jbu);
    // 复选框
    JCheckBox jch1 = new JCheckBox("记住密码");
    jch1.setFocusPainted(false);
    jch1.setFont(new Font("宋体", 0, 13));
    jch1.setBounds(0, 85, 80, 20);
    JCheckBox jch2 = new JCheckBox("自动登录");
    jch2.setFocusPainted(false);
    jch2.setFont(new Font("宋体", 0, 12));
    jch2.setBounds(100, 85, 80, 20);
    panel.add(jch2);
    panel.add(jch1);
    ll = new LoginListener(jcoCenter, jpaCenter, jf);
    return panel;
  }

  // 创建右部面板
  public static JPanel CreateEastPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setPreferredSize(new Dimension(100, 0));
    JLabel regeist = new JLabel("注册账号");
    regeist.setForeground(new Color(100, 149, 238));
    regeist.setBounds(0, 13, 60, 30);
    regeist.setFont(new Font("宋体", 0, 12));
    JLabel regetpwd = new JLabel("忘记密码");
    regetpwd.setForeground(new Color(100, 149, 238));
    regetpwd.setBounds(0, 43, 60, 30);
    regetpwd.setFont(new Font("宋体", 0, 12));
    panel.add(regeist);
    panel.add(regetpwd);
    return panel;
  }

  // 创建底部面板
  public static JPanel CreateSouthPanel() {
    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(0, 51));// 设置面板大小
    panel.setLayout(null);
    JButton jble = new JButton(new ImageIcon("day18\\images\\single_normal.jpg"));
    jble.setPreferredSize(new Dimension(40, 40));// 设置按钮大小
    jble.setFocusPainted(false);// 去除按钮边框
    jble.setRolloverIcon(new ImageIcon("day18\\images\\single_down.jpg"));// 鼠标悬停时的图片
    jble.setBorderPainted(false);// 去除按钮边框
    jble.setContentAreaFilled(false);// 去除按钮背景
    jble.setBounds(0, 10, 40, 40);// 设置按钮位置
    jble.setToolTipText("多账户登录");
    ImageIcon image = new ImageIcon("day18\\images\\login_normal.jpg");
    JButton jb = new JButton("登  录", image);
    jb.setFont(new Font("宋体", 0, 12));
    jb.setBounds(130, 0, 175, 40);
    jb.setHorizontalTextPosition(SwingConstants.CENTER);// 文字居中
    jb.setFocusPainted(false);// 去除按钮边框
    jb.setContentAreaFilled(false);// 去除按钮背景 透明按钮
    jb.setBorderPainted(false);
    jb.setRolloverIcon(new ImageIcon("day18\\images\\right_hover.jpg"));
    JButton jbri = new JButton(new ImageIcon("day18\\images\\right_normal.jpg"));
    jbri.setBounds(380, 10, 40, 40);
    jbri.setFocusPainted(false);
    jbri.setContentAreaFilled(false);
    jbri.setBorderPainted(false);
    jbri.setRolloverIcon(new ImageIcon("day18\\images\\right_hover.jpg"));
    jbri.setToolTipText("二维码登录");// 提示信息
    panel.add(jble);
    panel.add(jb);
    panel.add(jbri);
    jb.addActionListener(ll);
    return panel;
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-04-28 10:13:55
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-04-28 10:13:55
  */
