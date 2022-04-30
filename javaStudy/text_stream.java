/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-22 17:41:17
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-22 19:52:20
 */
package javaStudy;

import java.util.ArrayList;
import java.util.stream.Stream;

class Person1 {
  private String name;

  @Override
  public String toString() {
    return "Person1 [name=" + name + "]";
  }

  public Person1(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

public class text_stream {
  public static void main(String[] args) {
    ArrayList<String> al1 = new ArrayList<>();
    al1.add("王小二");
    al1.add("张三");
    al1.add("李四");
    al1.add("王小三");
    al1.add("王小四");
    al1.add("王小五");
    ArrayList<String> al2 = new ArrayList<>();
    al2.add("张小二");
    al2.add("李四");
    al2.add("张小三");
    al2.add("张小四");
    al2.add("张小五");
    Stream<String> stream1 = al1.stream().filter(i -> i.length() == 3).limit(3);
    Stream<String> stream2 = al2.stream().filter(i -> i.startsWith("张")).skip(2);
    Stream.concat(stream1, stream2).map(i -> new Person1(i)).forEach(System.out::println);
  }
}