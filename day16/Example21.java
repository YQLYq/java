/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-14 09:52:20
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-14 16:11:23
 */
package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example21 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("张三");
    list.add("张三三");
    list.add("张三三三");
    list.add("赵六");
    Stream<String> stream = list.stream();
    Stream<String> stream2 = stream.filter(i -> i.startsWith("张")); //过滤
    Stream<String> stream3 = stream2.limit(4);//截取
    stream3.forEach(j -> System.out.println(j));
    list.stream().filter(i->i.startsWith("张")).limit(2).forEach(j->System.out.println(j));
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-04-14 09:52:20
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-04-14 09:52:20
  */
