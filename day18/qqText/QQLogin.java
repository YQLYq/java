/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-27 16:43:34
 * @LastEditors: ������
 * @LastEditTime: 2022-04-30 12:38:20
 */
package day18.qqText;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class QQLogin {
  private static JFrame jf = new JFrame();

  public static void iniLogin() {
    jf.setSize(426, 300);
    jf.setLocation(497, 242);
    jf.setUndecorated(true);// �ޱ߿�
    jf.setResizable(false);// ������ı��С
    jf.setVisible(true);
    // �ñ߽粼�ֹ����� BorderLayout
    BorderLayout border_layout = new BorderLayout();
    jf.setLayout(border_layout);
    // �����������
    JPanel panel_north = CreatePanle.CreateNorPanel(jf);
    jf.add(panel_north, BorderLayout.PAGE_START);
    // �����в����
    JPanel panel_center = CreatePanle.CreateCenterPanel(jf);
    jf.add(panel_center, BorderLayout.CENTER);
    // �����ײ����
    JPanel panel_south = CreatePanle.CreateSouthPanel();
    jf.add(panel_south, BorderLayout.PAGE_END);
    // ���������
    JPanel panel_west = CreatePanle.CreateWestPanel();
    jf.add(panel_west, BorderLayout.LINE_START);
    // �����Ҳ����
    JPanel panel_east = CreatePanle.CreateEastPanel();
    jf.add(panel_east, BorderLayout.LINE_END);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(QQLogin::iniLogin);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ������
  * 
  * @Date: 2022-04-27 16:43:34
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-04-27 16:43:34
  */
