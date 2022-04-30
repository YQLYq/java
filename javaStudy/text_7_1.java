/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-23 12:59:49
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-28 10:04:29
 */
package javaStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class text_7_1 {
  public static void main(String[] args) throws Exception {
    FileInputStream fis = new FileInputStream("javaStudy\\1.text");
    FileOutputStream fos = new FileOutputStream("javaStudy\\2.text");
    int len = 0;
    byte[] b = new byte[1024];
    while ((len = fis.read(b)) != -1) {
      fos.write(b, 0, len);
    }
    fis.close();
    fos.close();
    BufferedReader br = new BufferedReader(new FileReader("javaStudy\\1.text"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("javaStudy\\2.text"));
    String str;
    while ((str = br.readLine()) != null) {
      bw.write(str);
      bw.newLine();
    }
    br.close();
    bw.close();

  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-23 12:59:49
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-23 12:59:49
  */
