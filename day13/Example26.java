/*
 * @Description: 构造器引用
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-20 15:24:32
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-20 16:23:32
 */
package day13;

interface PersonBuilder {
  Person buildPerson(String name);
}

class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

public class Example26 {
  public static void printName(String name, PersonBuilder personBuilder) {
    System.out.println(personBuilder.buildPerson(name).getName());
  }

  public static void main(String[] args) {
    printName("dd", t -> new Person(t));
    printName("name", Person::new);
  }
}