/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-31 09:23:48
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-31 09:56:43
 */
package day16;

import java.util.ArrayList;
import java.util.Iterator;

public class Example03 {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("das");
    arrayList.add("index, element");
    Iterator<String> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      Object object = iterator.next();
      System.out.println(object);
    }
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-03-31 09:23:48
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-03-31 09:23:48
  */
