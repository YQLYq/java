/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-01-30 09:47:31
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-01-30 10:08:15
 */
package project2Text2.bean;

public class Customer {
    private String name;
    private int age;
    private char gender;

    public Customer() {
    }

    public Customer(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
}