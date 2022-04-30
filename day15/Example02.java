/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-26 12:59:39
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-26 13:10:21
 */
package day15;

public class Example02 {
  public static void main(String[] args) {
    String s = "abcdefghrasdefghrasdefghrasdadwgsdwdasdsdaefghrasdefghrasdfscacccccccfdfvdwq";
    System.out.println("长度" + s.length());
    System.out.println("第一个出现的字符" + s.charAt(0)); // charAt(index)返回字符串index上的位置
    System.out.println("字符c第一次出现的位置" + s.indexOf('c'));// indexof(String str)返回指定子字符的第一次位置
    System.out.println("字符efghrasd第一次出现的位置" + s.indexOf("efghrasd"));// 以子字符串的第一个来找
    System.out.println("字符c最后一次出现的位置" + s.lastIndexOf('c'));
    System.out.println("字符efghrasd最一次出现的位置" + s.lastIndexOf("efghrasd"));
    
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-26 12:59:39
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-26 12:59:39
  */
