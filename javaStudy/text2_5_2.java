/*
 * @Description: 76ҳ��5���2С��
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-03 12:33:57
 * @LastEditors: ������
 * @LastEditTime: 2022-03-03 13:06:25
 */
package javaStudy;
import java.util.Arrays;
public class text2_5_2 {
    public static void main(String[] args) {
        int a [] = new int [] {25,24,12,76,101,96,28};
        BubbleSorting(a);
        System.out.println(Arrays.toString(a));
    }

    public static void BubbleSorting(int a[]) { //ð������
        int num; //��ʱ����
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j+1]){
                    num = a[j];
                    a[j] = a[j+1];
                    a[j+1] = num;
                }

            }
        }
    }
}