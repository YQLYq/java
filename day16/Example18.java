/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-13 17:32:38
 * @LastEditors: ������
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
    System.out.println("�����" + list);
    Collections.reverse(list);
    System.out.println("��ת��" + list);
    Collections.shuffle(list);
    System.out.println("�����" + list);
    Collections.swap(list, 0, list.size() - 1);
    System.out.println("������" + list);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ������
  * 
  * @Date: 2022-04-13 17:32:38
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-04-13 17:32:38
  */
