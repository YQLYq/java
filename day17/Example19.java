/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-22 15:28:11
 * @LastEditors: ������
 * @LastEditTime: 2022-04-22 15:53:07
 */
package day17;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example19 {
  public static void main(String[] args) {
    Path path = Paths.get("day17\\text1.txt");
    System.out.println("path�ĸ�·��" + path.getRoot());
    System.out.println("path�ĸ�·��" + path.getParent());
    System.out.println("path��·��������" + path.getNameCount());
    for (int i = 0; i < path.getNameCount(); i++) {
      Path name = path.getName(i);
      System.out.println("����" + i + "��·����" + name);
    }
    System.out.println("path��uri·��" + path.toUri());
    System.out.println("path�Ľ��·��" + path.toAbsolutePath());
  }
}