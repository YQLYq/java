/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-27 16:43:34
 * @LastEditors: 阳秦林
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
    jf.setUndecorated(true);// 无边框
    jf.setResizable(false);// 不允许改变大小
    jf.setVisible(true);
    // 用边界布局管理器 BorderLayout
    BorderLayout border_layout = new BorderLayout();
    jf.setLayout(border_layout);
    // 创建顶部面板
    JPanel panel_north = CreatePanle.CreateNorPanel(jf);
    jf.add(panel_north, BorderLayout.PAGE_START);
    // 创建中部面板
    JPanel panel_center = CreatePanle.CreateCenterPanel(jf);
    jf.add(panel_center, BorderLayout.CENTER);
    // 创建底部面板
    JPanel panel_south = CreatePanle.CreateSouthPanel();
    jf.add(panel_south, BorderLayout.PAGE_END);
    // 创建左部面板
    JPanel panel_west = CreatePanle.CreateWestPanel();
    jf.add(panel_west, BorderLayout.LINE_START);
    // 创建右部面板
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
  * @Autor: 阳秦林
  * 
  * @Date: 2022-04-27 16:43:34
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-04-27 16:43:34
  */
