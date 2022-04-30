/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-07 14:58:59
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-13 17:24:19
 */
package day16;

import java.util.TreeSet;

public class Example08 {
  public static void main(String[] args) {
    TreeSet<Integer> a = new TreeSet<Integer>();
    a.add(13);
    a.add(8);
    a.add(17);
    a.add(17);
    a.add(1);
    a.add(11);
    a.add(15);
    a.add(25);
    a.forEach(p -> System.out.print(p + " "));
    System.out.println(a.first());
    System.out.println(a.last());
    System.out.println(a.lower(11));
    System.out.println(a.higher(11));
    System.out.println(a.floor(11));
    System.out.println(a.ceiling(11));
    System.out.println(a.pollFirst());
    System.out.println(a.pollLast());

  }
}