/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-09 16:09:00
 * @LastEditors: 阳秦林
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
    System.out.println(map.containsKey("1")); // 查看键的值是否存在
    System.out.println(map.get("1"));// 获取键的值
    System.out.println(map.keySet());// 获取键
    System.out.println(map.entrySet());
    System.out.println(map.values());// 获取键值
    map.replace("1", "撒旦");
    System.out.println(map);
    map.remove("1");
    System.out.println(map);
  }
}