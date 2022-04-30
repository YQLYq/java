/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-02-04 11:24:14
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-02-05 16:46:28
 */
package day11;

public class person extends cust{
    public int name;
    public int age;
    
    public void eat (){
        System.out.println("s");
    }

    public void sheep (){
        System.out.println("1");
    }
    public person(int name, int age) {
        this.name = name;
        this.age = age;
    }

    public person() {
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}