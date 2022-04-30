/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-01-18 12:14:39
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-01-26 22:17:18
 */

package WangHongText;



public class text {
 public static void main(String[] args) {
    int a = 10;
    int b = 10;
    method(a,b);//使a = 100，b = 200
    System.out.println("a="+a);
    System.out.println("b="+b);
 }   

 public static void method(int a,int b) {
     a = a * 10;
     b = b * 20;
    System.out.println(a);
    System.out.println(b);
    System.exit(0); //退出
 }   
}

