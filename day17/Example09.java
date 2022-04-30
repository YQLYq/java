/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-18 16:01:55
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-18 16:41:49
 */
package day17;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example09 {
  public static void main(String[] args) throws Exception {
    FileReader fileReader = new FileReader("E:\\daima\\java\\day17\\text2.txt");
    int i = 0;
    while ((i = fileReader.read()) != -1) {
      System.out.print((char) i);
    }
    System.out.println("----------------------------");
    fileReader.close();
    BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\daima\\java\\day17\\text3.txt"));
    String s = null;
    while ((s = bufferedReader.readLine()) != null) {
      System.out.println(s);
    }
    bufferedReader.close();
  }
}
