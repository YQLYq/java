/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-22 15:28:11
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-22 15:53:07
 */
package day17;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example19 {
  public static void main(String[] args) {
    Path path = Paths.get("day17\\text1.txt");
    System.out.println("path的根路径" + path.getRoot());
    System.out.println("path的父路径" + path.getParent());
    System.out.println("path的路径名称数" + path.getNameCount());
    for (int i = 0; i < path.getNameCount(); i++) {
      Path name = path.getName(i);
      System.out.println("索引" + i + "的路径名" + name);
    }
    System.out.println("path的uri路径" + path.toUri());
    System.out.println("path的结点路径" + path.toAbsolutePath());
  }
}