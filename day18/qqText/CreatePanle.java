/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-28 10:13:55
 * @LastEditors: ������
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

  // �����������
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

  // ���������
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

  // �����в����
  public static JPanel CreateCenterPanel(JFrame jf) {
    JPanel panel = new JPanel();
    panel.setLayout(null);
    // �����˺ſ�
    String str[] = { "123456789", "234567891", "345678912" };
    JComboBox<Object> jcoCenter = new JComboBox<>(str);
    panel.add(jcoCenter);
    jcoCenter.setEditable(true);// ���Ը���
    jcoCenter.setBounds(0, 15, 175, 30);
    jcoCenter.setFont(new Font("Calibri", 0, 13));// ����
    // ���������
    JPasswordField jpaCenter = new JPasswordField();
    jpaCenter.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
    jpaCenter.setBounds(0, 44, 175, 30);
    jpaCenter.setPreferredSize(new Dimension(185, 25));
    panel.add(jpaCenter);
    // ����ͼ
    ImageIcon image = new ImageIcon("day18/images/keyboard.jpg");
    JButton jbu = new JButton(image);
    jbu.setPreferredSize(new Dimension(22, 20));
    jbu.setBorderPainted(false);
    jpaCenter.add(jbu);
    // ��ѡ��
    JCheckBox jch1 = new JCheckBox("��ס����");
    jch1.setFocusPainted(false);
    jch1.setFont(new Font("����", 0, 13));
    jch1.setBounds(0, 85, 80, 20);
    JCheckBox jch2 = new JCheckBox("�Զ���¼");
    jch2.setFocusPainted(false);
    jch2.setFont(new Font("����", 0, 12));
    jch2.setBounds(100, 85, 80, 20);
    panel.add(jch2);
    panel.add(jch1);
    ll = new LoginListener(jcoCenter, jpaCenter, jf);
    return panel;
  }

  // �����Ҳ����
  public static JPanel CreateEastPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setPreferredSize(new Dimension(100, 0));
    JLabel regeist = new JLabel("ע���˺�");
    regeist.setForeground(new Color(100, 149, 238));
    regeist.setBounds(0, 13, 60, 30);
    regeist.setFont(new Font("����", 0, 12));
    JLabel regetpwd = new JLabel("��������");
    regetpwd.setForeground(new Color(100, 149, 238));
    regetpwd.setBounds(0, 43, 60, 30);
    regetpwd.setFont(new Font("����", 0, 12));
    panel.add(regeist);
    panel.add(regetpwd);
    return panel;
  }

  // �����ײ����
  public static JPanel CreateSouthPanel() {
    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(0, 51));// ��������С
    panel.setLayout(null);
    JButton jble = new JButton(new ImageIcon("day18\\images\\single_normal.jpg"));
    jble.setPreferredSize(new Dimension(40, 40));// ���ð�ť��С
    jble.setFocusPainted(false);// ȥ����ť�߿�
    jble.setRolloverIcon(new ImageIcon("day18\\images\\single_down.jpg"));// �����ͣʱ��ͼƬ
    jble.setBorderPainted(false);// ȥ����ť�߿�
    jble.setContentAreaFilled(false);// ȥ����ť����
    jble.setBounds(0, 10, 40, 40);// ���ð�ťλ��
    jble.setToolTipText("���˻���¼");
    ImageIcon image = new ImageIcon("day18\\images\\login_normal.jpg");
    JButton jb = new JButton("��  ¼", image);
    jb.setFont(new Font("����", 0, 12));
    jb.setBounds(130, 0, 175, 40);
    jb.setHorizontalTextPosition(SwingConstants.CENTER);// ���־���
    jb.setFocusPainted(false);// ȥ����ť�߿�
    jb.setContentAreaFilled(false);// ȥ����ť���� ͸����ť
    jb.setBorderPainted(false);
    jb.setRolloverIcon(new ImageIcon("day18\\images\\right_hover.jpg"));
    JButton jbri = new JButton(new ImageIcon("day18\\images\\right_normal.jpg"));
    jbri.setBounds(380, 10, 40, 40);
    jbri.setFocusPainted(false);
    jbri.setContentAreaFilled(false);
    jbri.setBorderPainted(false);
    jbri.setRolloverIcon(new ImageIcon("day18\\images\\right_hover.jpg"));
    jbri.setToolTipText("��ά���¼");// ��ʾ��Ϣ
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
  * @Autor: ������
  * 
  * @Date: 2022-04-28 10:13:55
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-04-28 10:13:55
  */
