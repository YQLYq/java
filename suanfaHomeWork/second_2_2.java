/*
 * @Description: �ڶ�����ҵ��2��
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-11 12:05:32
 * @LastEditors: ������
 * @LastEditTime: 2022-03-11 12:34:03
 */
package suanfaHomeWork;

import java.util.Scanner;

public class second_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������(0Ϊ�˳�)");
        while (scanner.hasNextInt()){
            int num;
            num = scanner.nextInt();
            if( num == 0){
                System.out.println("�˳�");
                scanner.close();
                break;
            }
            qin(num);
        }
        
     }
     public static void qin (int num){ 
         int sum = 0; //�ܺ�
         if (num>100000){
             return;
         }
         else{
            int f;
            int g;
            for(int i = 1;i<=num;i++){
                f = f_add(i);
                g = g_add(i,0);
                if (f == g){
                    sum++;
                }
            }
         } 
         System.out.println("һ����"+sum);

     }
     public static int g_add(int num,int sum){ //��������ƺ�
        if (num != 0){
            sum += num%2;
            return g_add(num/2, sum);
        }
        else {
            return sum;
        }
    }
     public static int f_add (int num){//�����λ����
        if(num < 10){
            return num;
        }
        return num%10 + f_add(num/10);
    }
}
/*
 * @Description: �ڶ�����ҵ��2��
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-10 15:23:27
 * @LastEditors: ������
 * @LastEditTime: 2022-03-10 15:23:27
 */

