/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-26 12:59:39
 * @LastEditors: ������
 * @LastEditTime: 2022-03-26 13:10:21
 */
package day15;

public class Example02 {
  public static void main(String[] args) {
    String s = "abcdefghrasdefghrasdefghrasdadwgsdwdasdsdaefghrasdefghrasdfscacccccccfdfvdwq";
    System.out.println("����" + s.length());
    System.out.println("��һ�����ֵ��ַ�" + s.charAt(0)); // charAt(index)�����ַ���index�ϵ�λ��
    System.out.println("�ַ�c��һ�γ��ֵ�λ��" + s.indexOf('c'));// indexof(String str)����ָ�����ַ��ĵ�һ��λ��
    System.out.println("�ַ�efghrasd��һ�γ��ֵ�λ��" + s.indexOf("efghrasd"));// �����ַ����ĵ�һ������
    System.out.println("�ַ�c���һ�γ��ֵ�λ��" + s.lastIndexOf('c'));
    System.out.println("�ַ�efghrasd��һ�γ��ֵ�λ��" + s.lastIndexOf("efghrasd"));
    
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ������
  * 
  * @Date: 2022-03-26 12:59:39
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-03-26 12:59:39
  */
