/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-17 10:42:16
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-17 10:58:35
 */
package javaStudy;

import java.util.HashSet;

class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return name + ":" + age;
  }

  public int hasCode() {
    return name.hashCode();
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Person)) {
      return false;
    }
    Person p = (Person) obj;
    return p.name.equals(this.name);
  }
}

public class text_6_1 {
  public static void main(String[] args) {
    HashSet<Person> hashSet = new HashSet<Person>();
    Person p1 = new Person("张三", 18);
    Person p2 = new Person("张三", 27);
    Person p3 = new Person("李四", 20);
    hashSet.add(p1);
    hashSet.add(p2);
    hashSet.add(p3);
    hashSet.add(p3);
    hashSet.forEach(action -> System.out.println(action));
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-04-17 10:42:16
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-04-17 10:42:16
  */
