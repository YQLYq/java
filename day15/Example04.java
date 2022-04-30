/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-26 14:00:43
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-26 14:03:12
 */
package day15;

public class Example04 {
  public static void main(String[] args) {
    String s = "     http:// localhost : 8080";
    System.out.println(s.trim());// 去除两边的空格
    System.out.println(s.replace(" ", ""));//替换
  }
}