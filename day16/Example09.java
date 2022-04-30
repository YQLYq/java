/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-09 14:18:44
 * @LastEditors: ������
 * @LastEditTime: 2022-04-09 15:05:09
 */
package day16;

import java.util.TreeSet;

class Teacher implements Comparable<Object> {
  String name;
  int age;

  public Teacher(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return name + ":" + age;
  }

  @Override
  public int compareTo(Object obj) {
    Teacher s = (Teacher) obj;
    if (this.age - s.age > 0) {
      return 1;
    }
    if (this.age - s.age == 0) {
      return this.name.compareTo(s.name);
    }
    return -1;
  }

}

public class Example09 {

  public static void main(String[] args) {
    TreeSet<Object> treeSet = new TreeSet<Object>();
    treeSet.add(new Teacher("����", 20));
    treeSet.add(new Teacher("����", 30));
    treeSet.add(new Teacher("����", 20));
    treeSet.add(new Teacher("����", 30));
    System.out.println(treeSet);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ������
  * 
  * @Date: 2022-04-09 14:18:44
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-04-09 14:18:44
  */
