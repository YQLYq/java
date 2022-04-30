/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-17 15:13:54
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-17 15:18:58
 */
package day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example03 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("E:\\daima\\java\\day17\\pocture\\1 (1).jpg");
    FileOutputStream on = new FileOutputStream("E:\\daima\\java\\day17\\1 (1).jpg");
    int len = 0;
    long beginTime = System.currentTimeMillis();
    while ((len = in.read()) != -1) {
      on.write(len);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("∫ƒ ±£∫" + (endTime - beginTime) + "ms");
    in.close();
    on.close();
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-17 15:13:54
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-17 15:13:54
  */
