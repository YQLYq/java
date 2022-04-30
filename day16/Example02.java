/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-31 08:58:13
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-31 09:23:39
 */
package day16;

import java.util.LinkedList;

public class Example02 {
  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.add(1);
    linkedList.addFirst(2);
    linkedList.addLast(3);
    linkedList.offer(1);
    linkedList.offerFirst(2);
    linkedList.remove(1);
    linkedList.removeFirst();
    linkedList.pollFirst();
    linkedList.pop();
    int a = linkedList.peekFirst();
    System.out.println(a);
    System.out.println(linkedList);

  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-03-31 08:58:13
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-03-31 08:58:14
  */
