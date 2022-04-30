/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-19 14:10:34
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-20 10:54:57
 */
package day17;

import java.io.File;

public class Example14 {
  public static void deleteFile(File file) {
    File[] file1 = file.listFiles();
    for (File file2 : file1) {
      if (file2.isDirectory()) {
        deleteFile(file2);
      }
      file2.delete();
    }
    file.delete();
  }

  public static void main(String[] args) {
    File file = new File("E:\\daima\\java\\Text");
    deleteFile(file);
  }
}