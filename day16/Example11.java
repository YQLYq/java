/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-09 16:09:00
 * @LastEditors: ������
 * @LastEditTime: 2022-04-10 16:38:56
 */
package day16;

import java.util.HashMap;
import java.util.Map;

public class Example11 {
  public static void main(String[] args) {
    Map<Object, Object> map = new HashMap<>();
    map.put("1", "ds");
    map.put("2", "ds");
    map.put("1", "ss");
    System.out.println(map);
    System.out.println(map.containsKey("1")); // �鿴����ֵ�Ƿ����
    System.out.println(map.get("1"));// ��ȡ����ֵ
    System.out.println(map.keySet());// ��ȡ��
    System.out.println(map.entrySet());
    System.out.println(map.values());// ��ȡ��ֵ
    map.replace("1", "����");
    System.out.println(map);
    map.remove("1");
    System.out.println(map);
  }
}