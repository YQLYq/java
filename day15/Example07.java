/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-26 18:48:17
 * @LastEditors: ������
 * @LastEditTime: 2022-03-26 19:04:34
 */
package day15;

public class Example07 {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    sb.append("sda");// ���
    System.out.println(sb);
    sb.insert(3, "dds");// ����
    System.out.println(sb);
    sb.delete(3, 5);// ɾ��3��5
    System.out.println(sb);
    sb.deleteCharAt(3);// ɾ��ָ��
    System.out.println(sb);
    sb.replace(0, 1, "dddd");//ָ���ķ�Χ�滻
    System.out.println(sb);
    sb.setCharAt(0, 'w');//�滻
    System.out.println(sb);
    sb.reverse();//��ת
    System.out.println(sb);
    sb.delete(0, sb.length());//���������
    System.out.println(sb);
  }
}