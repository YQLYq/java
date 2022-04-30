/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-18 15:49:13
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-18 16:39:47
 */
package day17;

import java.io.*;

public class Example08 {
  public static void main(String[] args) throws Exception {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\daima\\java\\day17\\text2.txt"));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\daima\\java\\day17\\text3.txt"));
    String s = null;
    while ((s = bufferedReader.readLine()) != null) {
      bufferedWriter.write(s);
      bufferedWriter.newLine();
    }
    bufferedReader.close();
    bufferedWriter.close();
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-18 15:49:13
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * *
  * 
  * @LastEditTime: 2022-04-18 15:49:13
  */
