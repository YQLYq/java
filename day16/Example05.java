/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-02 11:10:57
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-07 09:13:19
 */
package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Example05 {
  public static void main(String[] args) {
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add(1);
    arrayList.add(1);
    arrayList.add(1);
    arrayList.add(1);
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.add(1);
    linkedList.add(1);
    linkedList.add(1);
    linkedList.add(1);
    arrayList.forEach(a -> System.out.println(a));
    linkedList.forEach(a -> System.out.println(a));
    Iterator<Object> it = arrayList.iterator();
    it.forEachRemaining(Object -> System.out.println(Object));
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-02 11:10:57
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-02 11:10:57
  */
