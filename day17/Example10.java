/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-18 16:55:54
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-18 18:50:03
 */
package day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Example10 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("E:\\daima\\java\\day17\\text1.txt");
    InputStreamReader isr = new InputStreamReader(in, "GBK");
    BufferedReader br = new BufferedReader(isr);
    FileOutputStream out = new FileOutputStream("E:\\daima\\java\\day17\\text4.txt");
    OutputStreamWriter osw = new OutputStreamWriter(out, "GBK");
    BufferedWriter bw = new BufferedWriter(osw);
    BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream("file"), "GBK"));
    String str = null;
    while ((str = br.readLine()) != null) {
      bw.write(str);
      System.out.println(str);
      bw.newLine();
    }
    br.close();
    bw.close();
    br1.close();
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-18 16:55:54
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-18 16:55:54
  */
