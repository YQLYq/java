package DeformableParameter;

public class DeformableParameter {
    public static void main(String[] args) {
        DeformableParameter p1 = new DeformableParameter();
        p1.show("sss");
        p1.show("s","d","da");
    }

    public void show(String s) {
        System.out.println(s);
    }

    //可变个数形参 类似与数组
    public void show(String ...s) {
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }

    public void show(int j,String ...s) {
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }

    //可变形参默认为跟数组一样，不能构成重载
    // public void show(String []s) {
    //     for (int i = 0; i < s.length; i++){
    //         System.out.println(s[i]);
    //     }
    // }

    //The variable argument type String of the method show must be the last parameter
    //只能放在后面，因为无法判断哪个给谁
    // public void show(String ...s,int i) { 错误方法
    //     for (int i = 0; i < s.length; i++){
    //         System.out.println(s[i]);
    //     }
    // }
    
    //最多只能有一个可变形参
    // public void show(String ...a,String ...s) {
    //     for (int i = 0; i < s.length; i++){
    //         System.out.println(s[i]);
    //     }
    // }
    

}