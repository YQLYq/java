package overload;
/**
 * ���������أ�overload��loading
 * 1.���壺��ͬһ���࣬�������һ�����ϵ�ͬ��������ֻҪ���ǵĲ��������Ͳ������Ͳ�ͬ���ɡ�
 * ������Ȩ�����η����������͡��βα������������嶼û�й�ϵ
 */
public class overload {
    //������ͬ
    public void show(int i,int j) {
        System.out.println("s");
    }
    public void show(int i) {
        System.out.println("s");
    }

    //���Ͳ�ͬ
    public void show(String i,int j) {
        System.out.println("s");
    }

    //��Ȩ�����η��޹� ����
    /*private void show(int i,int j) { 
        System.out.println("s");
    }*/

    /**�����������޹� ����
     *  public int show(String i,int j) {
            System.out.println("s");
            return 0;
        }
     */

     /**�βα������޹� ����
      * public void show(int s,int a) {
        System.out.println("s");
    }
      */
}