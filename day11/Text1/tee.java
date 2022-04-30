/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-15 11:52:32
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-15 23:28:49
 */
package day11.Text1;

interface Animal1{
    void showt();
}

abstract class Animal {
    abstract void show ();
}

class dog extends Animal implements Animal1 {
    void show(){
        System.out.println("dog");
    }
    public void showt(){
        System.out.println("dd");
    }
}

class cat extends Animal implements Animal1 {
    void show (){
        System.out.println("cat");
    }
    public void showt(){
        System.out.println("cc");
    }
    public void catshow (){
        System.out.println("ds");
    }
}

public class tee {
    public static void main(String[] args) {
        cat cat = new cat ();
        cat.show();
        dog dog = new dog ();
        dog.show();
        Animal an1 = new cat ();
        an1.show();
        //an1.catshow(); an1 catshow 不是父类的不能调用
        //dog dog = (cat) cat; 
        cat cat2 = (cat)an1;
        cat2.showt();
        Animal an2 = new dog();
        if(an2 instanceof cat){
            
        }
    }
}/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-15 11:52:32
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-15 11:52:32
 */
