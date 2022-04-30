/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-13 11:51:29
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-13 17:30:13
 */
package day16;

import java.util.ArrayList;

public class Example17 {
  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<Object>();
    list.add("String");
    list.add("Collection");
    for (Object object : list) {
      String str = (String) object;
      System.out.println(str);
    }
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-13 11:51:29
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-13 11:51:29
  */
