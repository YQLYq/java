/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-19 13:54:04
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-19 14:02:46
 */
package day17;

import java.io.File;

public class Example13 {
  public static void main(String[] args) {
    File file = new File("project2Text");
    fileDir(file);
  }

  public static void fileDir(File file) {
    File[] files = file.listFiles();
    for (File fe : files) {
      if (fe.isDirectory()) {
        fileDir(fe);
      }
      System.out.println(fe);
    }
  }
}