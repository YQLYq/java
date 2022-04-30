/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-17 15:24:24
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-17 15:28:43
 */
package day17;

import java.io.*;

public class Example05 {
  public static void main(String[] args) throws Exception {
    BufferedInputStream bis = new BufferedInputStream(
        new FileInputStream("E:\\daima\\java\\day17\\pocture\\1 (1).jpg"));
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\daima\\java\\day17\\1 (1).jpg"));
    int len = 0;
    long beginTime = System.currentTimeMillis();
    while ((len = bis.read()) != -1) {
      bos.write(len);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("∫ƒ ±£∫" + (endTime - beginTime) + "ms");
    bis.close();
    bos.close();
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-17 15:24:24
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-17 15:24:24
  */
