/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-19 13:41:55
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-19 13:52:07
 */
package day17;

import java.io.File;
import java.util.Arrays;

public class Example12 {
  public static void main(String[] args) {
    File file = new File("day17");
    if (file.isDirectory()) {
      String[] fileNames = file.list();
      String [] fileNames2 = file.list((dir,name)->name.endsWith(".java"));
      Arrays.asList(fileNames).forEach(action -> System.out.println(action));
      Arrays.asList(fileNames2).forEach(action -> System.out.println(action));
    }
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-19 13:41:55
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-19 13:41:55
  */
