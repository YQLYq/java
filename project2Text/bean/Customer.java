/*
 * @Description: ���ݶ����װ
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-01-27 19:25:16
 * @LastEditors: ������
 * @LastEditTime: 2022-01-28 16:32:00
 */
package project2Text.bean;

public class Customer {
    private String name; //����
    private char gender; //�Ա�
    private int age; //����
    private String phone; //�ֻ���
    private String email; //����

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public Customer() {
    }
    
}