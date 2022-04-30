/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-14 19:12:54
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-14 19:17:08
 */
package day16;

import java.util.stream.Stream;

public class Example24 {
  public static void main(String[] args) {
    Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");
    stream.filter(i -> i.startsWith("张")).filter(predicate -> predicate.length() > 1).forEach(System.out::println);
    //stream.filter(i -> i.startsWith("张") && i.length() > 1);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-04-14 19:12:54
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-04-14 19:12:54
  */
