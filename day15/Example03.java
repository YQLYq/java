/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-26 13:11:44
 * @LastEditors: ������
 * @LastEditTime: 2022-03-26 13:19:35
 */
package day15;

public class Example03 {
  public static void main(String[] args) {
    String str = "jabs";
    char[] a = str.toCharArray();// �ַ���ת��Ϊchar����
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + ",");
    }
    String sss = String.valueOf(1111123195);// int��String
    System.out.println(sss.charAt(1));
    System.out.println(sss.lastIndexOf("1"));
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    
  }
}