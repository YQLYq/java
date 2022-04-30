/*
 * @Description: 第二次作业第2题非递归
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-10 15:23:27
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-11 12:05:43
 */
package suanfaHomeWork;

import java.util.Scanner;

public class second_2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数字(0为退出)");
        while (scanner.hasNextInt()){
            int num;
            num = scanner.nextInt();
            if( num == 0){
                System.out.println("退出");
                scanner.close();
                break;
            }
            qin(num);
        }
        
     }
     public static void qin (int num){ 
         int sum = 0; //总和
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
         System.out.println("一共有"+sum);

     }
     public static int g_add(int num){ //计算二进制和
        int sum = 0;
        int sex = num;
        while(sex != 0){
            sum += sex%2;
            sex = sex/2;
        }
        return sum;
     }
     public static int f_add (int num){//计算各位数和
        int count = 0;//位数
        int a = num;
        while (a > 0){ //判断多少位
            a = a / 10;
            count++;
        }
        int sum = 0; //和
        int s = count;
        while(count != 0){//计算各数位和
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
 * @Autor: 阳秦林
 * @Date: 2022-03-10 15:23:27
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-10 15:23:27
 */
