/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-09 15:05:29
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-09 15:32:28
 */
package day16;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Object> {
  @Override
  public int compare(Object o1, Object o2) {
    String s1 = (String) o1;
    String s2 = (String) o2;
    return s1.length() - s2.length();
  }

}

public class Example10 {
  public static void main(String[] args) {
    TreeSet<Object> rs = new TreeSet<>(new MyComparator());
    rs.add("abc");
    rs.add("abcd");
    rs.add("ab");
    System.out.println(rs);
    TreeSet<Object> ts = new TreeSet<>((obj1,obj2)->{
      String s1 = (String) obj1;
      String s2 = (String) obj2;
      return s1.length() - s2.length();
    });
    ts.add("ads");
    ts.add("ab");
    ts.add("abcd");
    System.out.println(ts);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-09 15:05:29
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-09 15:05:30
  */
