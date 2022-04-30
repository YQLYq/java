package ArraysUtil;


public class ArraysUtil {
    //求数组的最大值
    public int getMax (int arr[]){
        int max = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //求数组的最小值
    public int getMin(int arr[]){
        int min = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    //求数组的总和
    public int getSum (int arr[]){
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }

    //求数组的平均值
    public int getAvg (int arr[]){
        int Avg = 0;
        for (int i = 0;i<arr.length;i++){
            Avg +=arr[i];
        }
        return Avg/arr.length;
    }

    //反转数组
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

    //复制数组
    public int [] copy (int arr[]){
        int []arr1 = new int [arr.length];
        for (int i = 0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }

    //冒泡排序数组
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

    //遍历数组
    public void print (int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //查找指定元素
    public int getMax (int arr[],int dest){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dest)
            return i+1;
        }
        return -1;
    }
}