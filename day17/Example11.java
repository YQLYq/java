/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-18 18:51:02
 * @LastEditors: ������
 * @LastEditTime: 2022-04-19 12:40:13
 */
package day17;

import java.io.File;

public class Example11 {
  public static void main(String[] args) {
    File file = new File("day17\\text.txt");
    System.out.println("�ļ���:" + file.getName());
    System.out.println("�ļ������·��:" + file.getPath());
    System.out.println("�ļ��ľ���·��:" + file.getAbsolutePath());
    System.out.println("�ļ��ĸ�·����" + file.getParent());
    System.out.println(file.canRead() ? "�ɶ�" : "���ɶ�");
    System.out.println(file.canWrite() ? "��д" : "����д");
    System.out.println(file.isFile() ? "���ļ�" : "�����ļ�");
    System.out.println(file.isDirectory() ? "��Ŀ¼" : "����Ŀ¼");
    System.out.println(file.isAbsolute() ? "�Ǿ���·��" : "���Ǿ���·��");
    System.out.println("����޸�ʱ�䣺" + file.lastModified());
    System.out.println("�ļ���С��" + file.length() + "�ֽ�");
    System.out.println("�Ƿ�ɹ�ɾ���ļ�" + (file.delete() ? "��" : "��"));
    System.out.println(file.exists() ? "�ļ�����" : "�ļ�������");

  }
}