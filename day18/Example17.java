/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-27 10:57:31
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-27 16:41:11
 */
package day18;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class Example17 {
  private static void createAndShowGUI() {
    JFrame f = new JFrame("窗口");
    f.setSize(400, 400);
    f.setLocation(300, 300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPopupMenu popupMenu = new JPopupMenu();
    JMenuItem item1 = new JMenuItem("查看");
    JMenuItem item2 = new JMenuItem("刷新");
    popupMenu.add(item1);
    popupMenu.addSeparator();
    popupMenu.add(item2);
    f.addMouseListener(new MouseListener() {

      @Override
      public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON3) {
          popupMenu.show(e.getComponent(), e.getX(), e.getY());
        }

      }

      @Override
      public void mousePressed(MouseEvent e) {

      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mouseEntered(MouseEvent e) {

      }

      @Override
      public void mouseExited(MouseEvent e) {

      }

    });

  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example17::createAndShowGUI);
  }
}