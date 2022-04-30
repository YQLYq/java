/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-22 17:41:17
 * @LastEditors: ������
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
    al1.add("��С��");
    al1.add("����");
    al1.add("����");
    al1.add("��С��");
    al1.add("��С��");
    al1.add("��С��");
    ArrayList<String> al2 = new ArrayList<>();
    al2.add("��С��");
    al2.add("����");
    al2.add("��С��");
    al2.add("��С��");
    al2.add("��С��");
    Stream<String> stream1 = al1.stream().filter(i -> i.length() == 3).limit(3);
    Stream<String> stream2 = al2.stream().filter(i -> i.startsWith("��")).skip(2);
    Stream.concat(stream1, stream2).map(i -> new Person1(i)).forEach(System.out::println);
  }
}