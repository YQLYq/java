/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-03 12:25:31
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-03 12:30:08
 */
package javaStudy;

public class text2_5_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                continue;
            }
            else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}