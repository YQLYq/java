/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-24 10:19:05
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-25 10:44:20
 */
package day14;

public class EmployeeText {
  public static void main(String[] args) {
    SalariedEmployee salariedEmployee = new SalariedEmployee("d", 1);
    salariedEmployee.setYue(1000);
    System.out.println(salariedEmployee.getYue());
    salariedEmployee.getSalary(1);
    System.out.println(salariedEmployee.getYue());
    
    HourlyEmployee hourlyEmployee = new HourlyEmployee("name", 1);
    hourlyEmployee.setGong(100);
    hourlyEmployee.setHour(170);
    hourlyEmployee.add();
    System.out.println(hourlyEmployee.getYue());
    hourlyEmployee.getSalary(1);
    System.out.println(hourlyEmployee.getYue());
  }

}