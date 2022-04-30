/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-01-20 18:33:41
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-01-26 22:16:53
 */


package day10.Boy;

public class Boy {
    private String name;
    private int age;

    public Boy() {

    }
    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
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
    public void marry(Girl girl) {
        System.out.println("Œ“»¢"+girl.getName());
    }
    public void shout() {
        System.out.println("ƒ–£∫"+this.age + this.name);
    }




}