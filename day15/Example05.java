/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-26 14:05:29
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-26 16:44:55
 */
package day15;

public class Example05 {
  public static void main(String[] args) {
    String s1 = "Starter";
    String s2 = "St";
    System.out.println("判断是否以St开头" + s1.startsWith("St"));
    System.out.println("判断是否以er结尾" + s1.endsWith("er"));
    System.out.println("判断是否有包含该字符" + s1.contains("ar"));
    System.out.println("判断是否为空" + s1.isEmpty());
    System.out.println("判断是否相等" + s1.equals(s2));
    System.out.println("==判断内存地址是否相同" + (s1==s2));
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-26 14:05:29
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-26 14:05:29
  */
