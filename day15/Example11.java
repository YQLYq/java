/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-27 19:53:39
 * @LastEditors: ������
 * @LastEditTime: 2022-03-27 20:15:40
 */
package day15;

public class Example11 {
  public static void main(String[] args) {
    Runtime rt = Runtime.getRuntime();
    System.out.println("�������ĸ���" + rt.availableProcessors() + "��");// processors ������ availabe ���õ� ��ȡ�������ĸ���
    System.out.println("�����ڴ���" + rt.freeMemory() / 1024 / 1024 + "M"); // Memory �ڴ�
    System.out.println("�������ڴ���"+rt.maxMemory() / 1024 / 1024 + "M");
  }
}