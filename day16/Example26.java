/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-15 16:24:46
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-15 16:27:00
 */
package day16;

import java.util.stream.Stream;

public class Example26 {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");
    stream.skip(1).limit(2).forEach(System.out::println);
  }
}