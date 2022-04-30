/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-15 13:24:37
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-15 16:23:27
 */
package day16;

import java.util.stream.Stream;

public class Example25 {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("test", "test1", "test2");
    stream.filter(s -> s.startsWith("t")).map(String::toUpperCase).sorted().forEach(System.out::println);

  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-15 13:24:37
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-15 13:24:37
  */
