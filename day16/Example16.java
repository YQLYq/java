/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-13 11:18:33
 * @LastEditors: ������
 * @LastEditTime: 2022-04-13 11:49:42
 */
package day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Example16 {
  public static void main(String[] args) throws Exception {
    Properties pps = new Properties();
    pps.load(new FileInputStream("E:/daima/java/day16/test.properties"));
    pps.forEach((k, v) -> System.out.println(k + "=" + v));
    FileOutputStream out = new FileOutputStream("E:/daima/java/day16/test.properties");
    pps.setProperty("charset", "UTF-8");
    pps.store(out, "����charset����");
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ������
  * 
  * @Date: 2022-04-13 11:18:33
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-04-13 11:18:33
  */
