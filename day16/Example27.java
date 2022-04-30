/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-17 11:14:48
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-17 11:20:35
 */
package day16;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example27 {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("a", "b", "c");
    List<String> list = stream.filter(i -> i.startsWith("a")).collect(Collectors.toList());
    list.forEach(action -> System.out.println(action));
    Stream<String> stream1 = Stream.of("a", "b", "c");
    String str = stream1.filter(i -> i.startsWith("a")).collect(Collectors.joining("delimiter"));
    System.out.println(str);
  }
}