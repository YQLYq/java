/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-14 09:37:55
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-14 09:44:33
 */
package javaStudy;

import java.util.ArrayList;

class Employee {
  String name;
  double wage;

  public Employee(String name, double wage) {
    this.name = name;
    this.wage = wage;
  }

}

public class text_list {
  public static void main(String[] args) {
    Employee e1 = new Employee("lili", 5000.0);
    Employee e2 = new Employee("lisi", 5500.0);
    Employee e3 = new Employee("xixi", 4000.0);
    ArrayList<Employee> list = new ArrayList<>();
    list.add(e1);
    list.add(e2);
    list.add(e3);
    System.out.println("员工姓名" + "   " + "员工工资");
    for (Employee employee : list) {
      System.out.println(employee.name + "       " + employee.wage);
    }
  }
}