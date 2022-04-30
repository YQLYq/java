/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-13 17:32:38
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-13 17:46:29
 */
package day16;

import java.util.ArrayList;
import java.util.Collections;

public class Example18 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    Collections.addAll(list, "c", "z", "a", "b");
    System.out.println(list);
    Collections.sort(list);
    System.out.println("排序后：" + list);
    Collections.reverse(list);
    System.out.println("反转后：" + list);
    Collections.shuffle(list);
    System.out.println("乱序后：" + list);
    Collections.swap(list, 0, list.size() - 1);
    System.out.println("交换后：" + list);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-04-13 17:32:38
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-04-13 17:32:38
  */
