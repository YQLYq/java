/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-04-14 16:26:05
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-04-14 16:40:24
 */
package day16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example22 {
  public static void main(String[] args) {
    Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    List<Integer> list = Arrays.asList(arr);
    Stream<Integer> stream = list.stream();
    stream.forEach(i -> System.out.print(i));
    System.out.println();
    Stream<Integer> stream2 = Stream.of(arr);
    stream2.forEach(i -> System.out.print(i));
    System.out.println();
    Stream<Integer> stream3 = Arrays.stream(arr);
    stream3.forEach(action -> System.out.print(action));
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-04-14 16:26:05
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-04-14 16:26:05
  */
