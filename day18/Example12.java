/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-26 17:45:47
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-26 18:08:30
 */
package day18;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Example12 {
  private static void createAndShowGUI() {
    JFrame f = new JFrame("¥∞ø⁄");
    f.setLayout(new BorderLayout());
    f.setSize(500, 500);
    f.setLocation(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel();
    ImageIcon icon = new ImageIcon("day18\\images\\error.jpg");
    Image img = icon.getImage();
    img = img.getScaledInstance(500, 400, Image.SCALE_DEFAULT);
    icon.setImage(img);
    label.setIcon(icon);
    JPanel panel = new JPanel();
    JLabel label2 = new JLabel("¥ÌŒÛ");
    panel.add(label2);
    f.add(label, BorderLayout.PAGE_START);
    f.add(panel, BorderLayout.PAGE_END);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Example12::createAndShowGUI);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-26 17:45:47
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-26 17:45:47
  */
