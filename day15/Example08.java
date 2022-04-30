/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-27 11:19:54
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-27 11:45:52
 */
package day15;

import java.util.Properties;
import java.util.Set;

public class Example08 {
  public static void main(String[] args) {
    Properties properties = System.getProperties();
    System.out.println(properties);
    Set<String> propertyNames = properties.stringPropertyNames();// 返回string的属性
    for (String key : propertyNames) {
      String value = System.getProperty(key); //获取键的属性
      System.out.println(key + "->" + value);
    }
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-27 11:19:54
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-27 11:19:54
  */
