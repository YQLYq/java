/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-02-06 16:15:20
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-02-06 16:37:44
 */
package day11.Text1;

import java.util.Scanner;

public class KidsText {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.salary = readInt();
        someKid.sex = readInt();
        someKid.manOrWoman();
        someKid.employeed();

    }
    private static Scanner scanner = new Scanner (System.in);
    public static int  readInt (){
        int a = -1;
        if (scanner.hasNext()){
            a = scanner.nextInt();
        }
        return a;
    }
}