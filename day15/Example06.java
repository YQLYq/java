/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-26 16:47:33
 * @LastEditors: ������
 * @LastEditTime: 2022-03-26 18:40:50
 */
package day15;

import java.util.Arrays;

public class Example06 {
  public static void main(String[] args) {
    String interceptString = "2020-22-10";
    System.out.println("��6����ʼ��ȡ" + interceptString.substring(5));
    System.out.println("��6������8��" + interceptString.substring(5, 8));
    String st[] = interceptString.split("-");// split��ת��ΪString����
    System.out.println(Arrays.toString(st));
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ������
  * 
  * @Date: 2022-03-26 16:47:33
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-03-26 16:47:33
  */
