package WangHongText;

public class printText {
    public static void main(String[] args) {
        int []arr = new int []{1,2,3}; //调用的是 （objet a）
        System.out.println(arr); //地址值

        char []arr1 = new char[]{'a','b'}; //调用的是 （char []）
        System.out.println(arr1);//ab
    }
}