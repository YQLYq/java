/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-27 10:33:31
 * @LastEditors: ������
 * @LastEditTime: 2022-04-27 10:56:42
 */
package day18;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class Example16 {
  private static void createAndShowGUI() {
    JFrame f = new JFrame("����");
    f.setSize(400, 400);
    f.setLocation(400, 400);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JMenuBar menuBar = new JMenuBar();
    JMenu menu1 = new JMenu("�ļ�(F)");
    JMenu menu2 = new JMenu("����(H)");
    menuBar.add(menu1);
    menuBar.add(menu2);
    JMenuItem item1 = new JMenuItem("�½�(N)");
    JMenuItem item2 = new JMenuItem("�˳�(X)");
    menu1.add(item1);
    menu1.addSeparator();
    menu1.add(item2);
    item1.addActionListener(e -> {
      JDialog dialog = new JDialog(f, "�ޱ���", true);
      dialog.setSize(200, 100);
      dialog.setLocation(300, 200);
      dialog.setVisible(true);
      dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
    });
    item2.addActionListener(e -> System.exit(0));
    f.setJMenuBar(menuBar);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example16::createAndShowGUI);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ������
  * 
  * @Date: 2022-04-27 10:33:31
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-04-27 10:33:31
  */
