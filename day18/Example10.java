/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ÑôÇØÁÖ
 * @Date: 2022-04-26 15:08:27
 * @LastEditors: ÑôÇØÁÖ
 * @LastEditTime: 2022-04-26 15:50:55
 */
package day18;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;

public class Example10 {
  private static void createAndShowGUI() {
    JFrame f = new JFrame("PanelDemo");
    f.setLayout(new BorderLayout());
    f.setSize(400, 400);
    f.setLocation(300, 300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    JPanel panel = new JPanel();
    panel.add(new JButton("°´Å¥1"));
    panel.add(new JButton("°´Å¥1"));
    panel.add(new JButton("°´Å¥1"));
    panel.add(new JButton("°´Å¥1"));
    scrollPane.setViewportView(panel);
    f.add(scrollPane, BorderLayout.CENTER);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example10::createAndShowGUI);
  }

}