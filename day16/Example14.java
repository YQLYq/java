/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-11 18:14:37
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-11 22:46:19
 */
package day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Example14 {
  public static void main(String[] args) {
    Map<Object, Object> map = new HashMap<Object, Object>();
    Map<Object, Object> map1 = new LinkedHashMap<Object, Object>();
    map.put("a", "1");
    map.put("b", "2");
    map.put("c", "3");
    map1.put("a", "1");
    map1.put("b", "2");
    map1.put("c", "3");
    map.forEach((Key, value) -> System.out.println(Key + "=" + value));
    Collection<Object> values = map.values();
    values.forEach(value -> System.out.println(value));
    System.out.println(map1);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-11 18:14:37
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-11 18:14:37
  */
