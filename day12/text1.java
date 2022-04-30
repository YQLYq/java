/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-17 09:52:13
 * @LastEditors: ������
 * @LastEditTime: 2022-03-18 16:08:16
 */
package day12;

class Student {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Student() {

  }

  public void show() {
    System.out.println("����" + name + "����" + age);
  }

}

class Undergraduate extends Student {
  private String degree;

  public Undergraduate() {
  }

  public Undergraduate(String name, int age, String degree) {
    super(name, age);
    this.degree = degree;
  }

  public void show() {
    System.out.println("����" + super.getName() + "����" + super.getName() + "רҵ" + degree);
  }
}

public class text1 {
  public static void main(String[] args) {
    Student student = new Student("dd", 15);
    student.show();
    Undergraduate undergraduate = new Undergraduate("dds", 74, "Sd");
    undergraduate.show();
  }
}