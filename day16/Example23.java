/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-14 16:54:33
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-14 19:12:28
 */
package day16;

import java.util.stream.Stream;

public class Example23 {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");
    stream.forEach(action -> System.out.println(action));
    // stream.forEach(System.out::println); 只能使用一次
  }
}