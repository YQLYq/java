/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-15 16:24:46
 * @LastEditors: ������
 * @LastEditTime: 2022-04-15 16:27:00
 */
package day16;

import java.util.stream.Stream;

public class Example26 {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("����", "����", "����", "����");
    stream.skip(1).limit(2).forEach(System.out::println);
  }
}