/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-27 20:50:29
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-27 22:56:40
 */
package day15;

public class Example12 {
  public static void main(String[] args) throws Exception {
    Runtime rt = Runtime.getRuntime();
    Process process = rt.exec("notepad.exe");
    Thread.sleep(3000);
    process.destroy();
  }
}