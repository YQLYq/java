/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-18 09:25:19
 * @LastEditors: ������
 * @LastEditTime: 2022-04-18 16:34:43
 */
package day17;

import java.io.FileReader;
import java.io.FileWriter;

public class Example07 {
  public static void main(String[] args) throws Exception {
    FileWriter fileWriter = new FileWriter("E:\\daima\\java\\day17\\text3.txt", true);
    FileWriter fileWriter1 = new FileWriter("E:\\daima\\java\\day17\\text2.txt", true);
    FileReader fileReader = new FileReader("E:\\daima\\java\\day17\\text2.txt");
    char[] b = new char[1024];
    int i = 0;
    try {
      fileWriter1.write("hello,world����\r\n");
      while ((i = fileReader.read(b)) != -1) {
        fileWriter.write(b, 0, i);
      }
      while ((i = fileReader.read()) != -1) {
        System.out.println((char) i);
      }
    } catch (Exception e) {
      System.out.println("��ȡ�ļ�ʧ��");
    } finally {
      fileReader.close();
      fileWriter.close();
      fileWriter1.close();
    }
  }
}