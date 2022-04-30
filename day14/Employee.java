/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-24 10:10:30
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-24 10:34:07
 */
package day14;

public class Employee {
  private String name;
  private int month;

  public Employee() {
  }

  public Employee(String name, int month) {
    this.name = name;
    this.month = month;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void getSalary(int month) {
  }
}

class SalariedEmployee extends Employee {
  private int yue;

  public SalariedEmployee(String name, int month) {
    super(name, month);
  }

  public int getYue() {
    return yue;
  }

  public void setYue(int yue) {
    this.yue = yue;
  }

  public void getSalary(int month) {
    if (month == this.getMonth()) {
      yue += 100;
    }
  }
}

class HourlyEmployee extends Employee {
  private double gong;
  private int hour;
  private double yue;

  public HourlyEmployee(String name, int month) {
    super(name, month);
  }

  public void add() {
    if (hour > 160) {
      yue = (hour - 160) * 1.5 * gong + 160 * gong;
    } else {
      yue = hour * gong;
    }
  }

  public double getYue() {
    return this.yue;
  }

  public void setYue(int yue) {
    this.yue = yue;
  }

  public double getGong() {
    return gong;
  }

  public void setGong(double gong) {
    this.gong = gong;
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public void getSalary(int month) {
    if (month == this.getMonth()) {
      yue += 100;
    }
  }
}
/*
 * @Description:
 * 
 * @Version: 2.0
 * 
 * @Autor: —Ù«ÿ¡÷
 * 
 * @Date: 2022-03-24 10:10:30
 * 
 * @LastEditors: —Ù«ÿ¡÷
 * 
 * @LastEditTime: 2022-03-24 10:10:30
 */
