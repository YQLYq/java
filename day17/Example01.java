/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-17 13:07:10
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-17 13:23:48
 */
package day17;

import java.io.FileInputStream;

public class Example01 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("E:\\daima\\java\\day17\\text.txt");
    int b = 0;
    while ((b = in.read()) != -1) {
      System.out.println(b);
    }
    in.close();
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-17 13:07:10
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-17 13:07:10
  */
