/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-10 15:58:48
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-11 13:43:31
 */
package day11;

public class textd {
    public static void main(String[] args) {
       System.out.println(f_add(123)); 
        // int n = 12345;
        // int count = 0;
        // int a = n;
        // while (a > 0){
        //     a = a / 10;
        //     count++;
        // }
        // int sum = 0;
        // int s = count;
        // while(count != 0){
        //     if (count == 1){
        //         sum += n/(Math.pow(10,s-1));
        //         break;
        //     }
        //     else if (count == s){
        //         sum += n %10;
        //         count--;
        //     }
        //     else {
        //         sum += (n /(Math.pow(10, s-count)) )%10;
        //         count--;
        //     }
        // }   
        // System.out.println(sum);
    }
    public static int f_add (int num){//计算各位数和
        if(num < 10){
            return num;
        }
        return num%10 + f_add(num/10);
    }
    public static long g_add(int  num,int sum){
        if (num != 0){
            sum += num%2;
            return g_add(num/2, sum);
        }
        else {
            return sum;
        }
    }
}