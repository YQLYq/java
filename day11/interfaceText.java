/*
 * @Description: �ӿ�
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-14 17:09:13
 * @LastEditors: ������
 * @LastEditTime: 2022-03-15 11:49:25
 */
package day11; 
interface Animal1{
    int ID = 1;
    void breathe();
    default void getType (final String type) {
        System.out.println("�ö�������"+type);
    }
    static int getID(){
        return ID;
    }
}
interface run extends Animal1  {
    void run1();
}
interface runs{
    void ss();
}
class dd{
    int a;
}
class Dog1 extends dd implements run,runs{
    public void breathe(){
        System.out.println("d");
    }
    public void run1 (){
        System.out.println("d");
    }
    public void ss(){
        System.out.println("Ds");
    }
}
public class interfaceText {
    
}/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-14 17:09:13
 * @LastEditors: ������
 * @LastEditTime: 2022-03-14 17:09:13
 */
