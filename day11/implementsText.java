/*
 * @Description: �ӿ�
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-14 16:45:07
 * @LastEditors: ������
 * @LastEditTime: 2022-03-15 11:49:33
 */
package day11;

interface Animal{
    int ID = 1; 
    void breathe();
    default void getType (String type){
        System.out.println("�ö�������"+type);
    }
    static int getID(){
        return ID;
    }
}
class Dog implements Animal{ 
    public void breathe(){
        System.out.println("d");
    }
}
public class implementsText {
    public static void main(String[] args) {
        System.out.println(Animal.getID());
        Dog dog = new Dog ();
        dog.breathe(); 
    }
}/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-14 16:45:07
 * @LastEditors: ������
 * @LastEditTime: 2022-03-14 16:45:07
 */
