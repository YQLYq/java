
/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-16 21:14:06
 * @LastEditors: ������
 * @LastEditTime: 2022-03-18 15:36:01
 */

package suanfaHomeWork;

public class third_1 {
     public static long count = 0;
    public static void main(String[] args) {
        int a[] = {3,1,4,5,2};
        Grouping(a);
        System.out.println("����Ϊ"+ count);
    }     
    public static void Grouping(int a[]) {//����
        if (a.length > 1){
            int []left = around(a, 0);
            int []right = around(a, 1);
            Grouping(left);
            Grouping(right);
            countResult(a,left,right);
        }
    }
    //���Ϸ��飬ֱ������ֻ��һ��
    public static int []around(int a[],int isFlag) {
        int result [];
        if(isFlag == 0){ //��������A������
            result = new int[a.length/2];
            for (int i = 0;i<a.length/2;i++){
                result[i] = a[i];
            }
        }
        else { //�ұ�
            result = new int[a.length-a.length/2];
            for (int i = 0;i<a.length-a.length/2;i++){
                result[i] = a[a.length/2+i];
            }
        }
        return result;
    }
    public static void countResult(int a[],int left[],int right[]) { //����
        int len = 0;
        int i = 0;
        int j = 0;
        int lenL = left.length;
        int lenR = right.length;
        while (i<lenL && j<lenR){
            if(left[i] > right[j]) {
                a[len++] = right[j++]; //��rightA[j]����leftA[i]Ԫ��֮ǰ����ôleftA[i]֮��lenL - i��Ԫ�ؾ�����rightA[j]
                count+= (lenL - i);   //�ϲ�֮ǰ��leftA��Ԫ���Ƿǽ������У�rightA��Ԫ��Ҳ�Ƿǽ������С����ԣ���ʱ������lenL -��i�������
            } else {
                a[len++] = left[i++];
            }
        }
        while(i < lenL)
            a[len++] = left[i++];
        while(j < lenR)
            a[len++] = right[j++];
    }
 }
