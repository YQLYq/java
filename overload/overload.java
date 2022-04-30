package overload;
/**
 * 方法的重载（overload）loading
 * 1.定义：在同一个类，允许存在一个以上的同名方法，只要它们的参数个数和参数类型不同即可。
 * 跟方法权限修饰符、返回类型、形参变量名、方法体都没有关系
 */
public class overload {
    //个数不同
    public void show(int i,int j) {
        System.out.println("s");
    }
    public void show(int i) {
        System.out.println("s");
    }

    //类型不同
    public void show(String i,int j) {
        System.out.println("s");
    }

    //跟权限修饰符无关 报错
    /*private void show(int i,int j) { 
        System.out.println("s");
    }*/

    /**跟返回类型无关 报错
     *  public int show(String i,int j) {
            System.out.println("s");
            return 0;
        }
     */

     /**形参变量名无关 报错
      * public void show(int s,int a) {
        System.out.println("s");
    }
      */
}