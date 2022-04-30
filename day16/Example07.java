/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-07 09:59:40
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-07 14:53:09
 */
package day16;

import java.util.HashSet;

class Student {
  String id;
  String name;

  public Student(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return id + " " + name;
  }

  public int hashCode() {
    return id.hashCode();
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Student)) {
      return false;
    }
    Student s = (Student) obj;
    return this.id.equals(s.id);
  }
}

public class Example07 {
  public static void main(String[] args) {
    HashSet<Student> hashSet = new HashSet<Student>();
    Student stu1 = new Student("001", "张三");
    Student stu2 = new Student("002", "李四");
    Student stu3 = new Student("003", "王五");
    Student stu4 = new Student("003", "王2");
    hashSet.add(stu1);
    hashSet.add(stu2);
    hashSet.add(stu3);
    hashSet.add(stu4);
    System.out.println(hashSet);

  }
}