/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-21 14:25:40
 * @LastEditors: ������
 * @LastEditTime: 2022-04-21 18:46:16
 */
package day17;

import java.nio.CharBuffer;

public class Example16 {
  public static void main(String[] args) {
    CharBuffer charbuffer = CharBuffer.allocate(6);
    System.out.println("����" + charbuffer.capacity());
    System.out.println("����ֵ" + charbuffer.limit());
    System.out.println("��ʼλ��" + charbuffer.position());
    charbuffer.put("c");
    charbuffer.put("x");
    charbuffer.put("s");
    System.out.println("����Ԫ�صĽ���ֵ" + charbuffer.limit());
    System.out.println("����Ԫ�ص�λ��" + charbuffer.position());
    charbuffer.flip();
    System.out.println("ִ��flip�Ľ���ֵ" + charbuffer.limit());
    System.out.println("ִ��flip��λ��" + charbuffer.position());
    System.out.println("ȡ���ĵ�һ��Ԫ��" + charbuffer.get());
    System.out.println("ȡ���Ľ���ֵ" + charbuffer.limit());
    System.out.println("ȡ����λ��" + charbuffer.position());
    charbuffer.clear();
    System.out.println("ִ��clear�Ľ���ֵ" + charbuffer.position());
    System.out.println("ִ��clear��λ��" + charbuffer.limit());
    System.out.println("ȡ���ĵ�һ��Ԫ��" + charbuffer.get());
    
  }
}