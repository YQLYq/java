package ArraysUtil;


public class ArraysUtil {
    //����������ֵ
    public int getMax (int arr[]){
        int max = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //���������Сֵ
    public int getMin(int arr[]){
        int min = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    //��������ܺ�
    public int getSum (int arr[]){
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }

    //�������ƽ��ֵ
    public int getAvg (int arr[]){
        int Avg = 0;
        for (int i = 0;i<arr.length;i++){
            Avg +=arr[i];
        }
        return Avg/arr.length;
    }

    //��ת����
    public void reverse (int arr[]){
        int i = 0;
        int j = arr.length;
        int num;
        while (i != j) {
            num = arr[i];
            arr[i] = arr[j];
            arr[j] = num;
            i++;j++;
        }
    }

    //��������
    public int [] copy (int arr[]){
        int []arr1 = new int [arr.length];
        for (int i = 0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }

    //ð����������
    public void  sort(int arr[]){
        int num;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    num = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = num;
                }
            }
        }
    }

    //��������
    public void print (int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //����ָ��Ԫ��
    public int getMax (int arr[],int dest){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dest)
            return i+1;
        }
        return -1;
    }
}