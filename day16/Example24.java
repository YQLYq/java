/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-14 19:12:54
 * @LastEditors: ������
 * @LastEditTime: 2022-04-14 19:17:08
 */
package day16;

import java.util.stream.Stream;

public class Example24 {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("����", "����", "����", "����");
    stream.filter(i -> i.startsWith("��")).filter(predicate -> predicate.length() > 1).forEach(System.out::println);
    //stream.filter(i -> i.startsWith("��") && i.length() > 1);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ������
  * 
  * @Date: 2022-04-14 19:12:54
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-04-14 19:12:54
  */
