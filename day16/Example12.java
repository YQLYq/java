/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-10 16:57:29
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-10 17:03:25
 */
package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example12 {
  public static void main(String[] args) {
    Map<Object, Object> map = new HashMap<>();
    map.put("1", "asd");
    map.put("2", "ssd");
    map.put("3", "dsd");
    System.out.println(map);
    Set<Object> keySet = map.keySet();
    Iterator<Object> it = keySet.iterator();
    while (it.hasNext()) {
      Object key = it.next();
      Object value = map.get(key);
      System.out.println(key + "=" + value);
    }
  }
}