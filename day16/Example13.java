/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-10 17:05:41
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-11 18:03:06
 */
package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example13 {
  public static void main(String[] args) {
    Map<Object, Object> map = new HashMap<>();
    map.put("1", "asd");
    map.put("2", "value");
    map.put("3", "valued");
    Set<?> entryset = map.entrySet();
    Iterator<?> it = entryset.iterator();
    while (it.hasNext()) {
      Map.Entry<?, ?> entry = (Map.Entry<?, ?>) it.next();
      Object key = entry.getKey();
      Object value = entry.getValue();
      System.out.println(key + ":" + value);
    }
  }
}