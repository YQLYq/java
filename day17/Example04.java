/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-17 15:20:29
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-17 15:23:29
 */
package day17;

import java.io.*;

public class Example04 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("E:\\daima\\java\\day17\\pocture\\1 (1).jpg");
    FileOutputStream on = new FileOutputStream("E:\\daima\\java\\day17\\1 (1).jpg");
    int len = 0;
    byte[] b = new byte[1024];
    long beginTime = System.currentTimeMillis();
    while ((len = in.read(b)) != -1) {
      on.write(b, 0, len);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("∫ƒ ±£∫" + (endTime - beginTime) + "ms");
    in.close();
    on.close();
  }
}