/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-14 16:54:33
 * @LastEditors: ������
 * @LastEditTime: 2022-04-14 19:12:28
 */
package day16;

import java.util.stream.Stream;

public class Example23 {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("����", "����", "����", "����");
    stream.forEach(action -> System.out.println(action));
    // stream.forEach(System.out::println); ֻ��ʹ��һ��
  }
}