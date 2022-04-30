/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-11 22:46:43
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-13 10:42:58
 */
package day16;

import java.util.Comparator;

import java.util.Map;
import java.util.TreeMap;

class myCustomCoparator implements Comparator<Object> {
  @Override
  public int compare(Object obj1, Object obj2) {
    String str1 = (String) obj1;
    String str2 = (String) obj2;
    return str2.compareTo(str1);
  }
}

public class Example15 {
  public static void main(String[] args) {
    Map<Object,Object> map = new TreeMap<Object,Object>(new myCustomCoparator());
    map.put("1", "value");
    map.put("2", "sasdasdsad");
    map.put("3", "d");
    System.out.println(map);

  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-11 22:46:43
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-11 22:46:43
  */
