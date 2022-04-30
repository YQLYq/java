/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-26 16:47:33
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-26 18:40:50
 */
package day15;

import java.util.Arrays;

public class Example06 {
  public static void main(String[] args) {
    String interceptString = "2020-22-10";
    System.out.println("第6个开始截取" + interceptString.substring(5));
    System.out.println("第6个到第8个" + interceptString.substring(5, 8));
    String st[] = interceptString.split("-");// split是转换为String数组
    System.out.println(Arrays.toString(st));
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-26 16:47:33
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-26 16:47:33
  */
