/*
 * @Description: �ڶ�����ҵ��1��
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-08 19:39:40
 * @LastEditors: ������
 * @LastEditTime: 2022-03-08 23:08:31
 */
package suanfaHomeWork;
import java.util.Scanner;

public class second {
    static int a[][] = new int [60][60]; 
    static int n ;
    public static void main(String[] args) {
        Scanner scanner =  new Scanner (System.in);
        int a;
        while (scanner.hasNextInt()){
            a = scanner.nextInt();
          if( a == 0){
                scanner.close();
                break;
            }
            else 
            n = a;
        }
        vrille(1,n,n*n,1); //��1��ʼ
        print(n);
    }
    public static void vrille (int num,int len,int sum,int k){ //numΪ��1�ۼӣ�lenΪ�߳���sumΪ�����ܺ�,kΪ����λ��
        if (len == 1){
            a[k][k] = num;
            return;
        }
        else if (len == 2){
            a[k][k] = num++;
            a[k][k+1] = num++;
            a[k+1][k] = sum;
            a[k+1][k+1] = num;
            return;
        }
        int cod = n + 1 -k ;
        for (int i = k; i <=cod; i++) { // �ϱ߿�
            a[k][i] = num;
            num++;
        }
        for (int j = k+1; j <=cod; j++){//�ұ߿�
            a[j][cod] = num;
            num++;
        }
        for (int i = cod-1; i>=k; i--){//�±߿�
            a[cod][i] = num;
            num++;
        }
        for (int j = cod-1; j >=k+1; j--){//��߿�
            a[j][k] = num;
            num++;
        }
        vrille(num,len-2,sum,k+1);
    }    
    public static void print(int n) {//�������
        for (int i = 1;i<=n;i++){
            for (int j = 1; j <=n; j++) {
                System.out.printf("%-8d",a[i][j]);
            }
            System.out.println();
        }
    }
}


