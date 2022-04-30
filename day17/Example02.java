/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-17 13:25:53
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-18 18:56:59
 */
package day17;

import java.io.FileOutputStream;

public class Example02 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("E:\\daima\\java\\day17\\text1.xls", true);
    String str = "Hello World!";
    out.write(str.getBytes());
    out.close();
  }
}
