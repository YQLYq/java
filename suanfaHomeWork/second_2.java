/*
 * @Description: �ڶ�����ҵ��2��ǵݹ�
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-10 15:23:27
 * @LastEditors: ������
 * @LastEditTime: 2022-03-11 12:05:43
 */
package suanfaHomeWork;

import java.util.Scanner;

public class second_2 {
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
                g = g_add(i);
                if (f == g){
                    sum++;
                }
            }
         } 
         System.out.println("һ����"+sum);

     }
     public static int g_add(int num){ //��������ƺ�
        int sum = 0;
        int sex = num;
        while(sex != 0){
            sum += sex%2;
            sex = sex/2;
        }
        return sum;
     }
     public static int f_add (int num){//�����λ����
        int count = 0;//λ��
        int a = num;
        while (a > 0){ //�ж϶���λ
            a = a / 10;
            count++;
        }
        int sum = 0; //��
        int s = count;
        while(count != 0){//�������λ��
            if (count == 1){
                sum += num/(Math.pow(10,s-1));
                break;
            }
            else if (count == s){
                sum += num %10;
                count--;
            }
            else {
                sum += (num /(Math.pow(10, s-count)) )%10;
                count--;
            }
        }   
        return sum;
     }

}/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-10 15:23:27
 * @LastEditors: ������
 * @LastEditTime: 2022-03-10 15:23:27
 */
