/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-17 11:29:17
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-21 18:32:34
 */
package javaStudy;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class text_6_2 {
  public static void main(String[] args) {
    Map<Integer, String> tree = new TreeMap<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
      }
    });

    tree.put(1, "Luck");
    tree.put(2, "John");
    tree.put(3, "Smith");
    tree.put(4, "Aimee");
    tree.put(5, "Amanda");

    Set<Integer> set = tree.keySet();
    Iterator<Integer> it = set.iterator();
    while (it.hasNext()) {
      Object key = it.next();
      Object value = tree.get(key);
      System.out.println(key + ":" + value);
    }

  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-17 11:29:17
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-17 11:29:17
  */
