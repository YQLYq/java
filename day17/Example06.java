/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-17 15:31:05
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-18 09:25:06
 */
package day17;

import java.io.FileReader;

public class Example06 {
  public static void main(String[] args) throws Exception {
    FileReader fileReader = new FileReader("E:\\daima\\java\\day17\\text1.txt");
    int len = 0;
    while ((len = fileReader.read()) != -1) {
      System.out.print((char) len);
    }
    fileReader.close();

  }
}