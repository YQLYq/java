/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-13 18:30:27
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-13 18:42:15
 */
package day16;

import java.util.ArrayList;
import java.util.Collections;

public class Example19 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Collections.shuffle(list);
    System.out.println(Collections.max(list));
    System.out.println(Collections.min(list));
    Collections.replaceAll(list, 8, 0);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    int index = Collections.binarySearch(list, 5);
    System.out.println(index);
    
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-13 18:30:27
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-13 18:30:27
  */
