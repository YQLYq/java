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

    //�ɱ�����β� ����������
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

    //�ɱ��β�Ĭ��Ϊ������һ�������ܹ�������
    // public void show(String []s) {
    //     for (int i = 0; i < s.length; i++){
    //         System.out.println(s[i]);
    //     }
    // }

    //The variable argument type String of the method show must be the last parameter
    //ֻ�ܷ��ں��棬��Ϊ�޷��ж��ĸ���˭
    // public void show(String ...s,int i) { ���󷽷�
    //     for (int i = 0; i < s.length; i++){
    //         System.out.println(s[i]);
    //     }
    // }
    
    //���ֻ����һ���ɱ��β�
    // public void show(String ...a,String ...s) {
    //     for (int i = 0; i < s.length; i++){
    //         System.out.println(s[i]);
    //     }
    // }
    

}