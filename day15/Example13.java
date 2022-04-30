/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-27 23:06:13
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-28 16:26:14
 */
package day15;

public class Example13 {
  public static void main(String[] args) {
    System.out.println("计算绝对值" + Math.abs(-1));
    System.out.println("计算正弦" + Math.sin(1));
    System.out.println("计算余弦" + Math.cos(1));
    System.out.println("计算正切" + Math.tan(1));
    System.out.println("计算平方根" + Math.sqrt(4));
    System.out.println("计算立法根" + Math.cbrt(8));
    System.out.println("计算乘方" + Math.pow(2, 4));
    System.out.println("求大于参数的最小的整数" + Math.ceil(1.6));
    System.out.println("求小于参数的最大整数" + Math.floor(-1.6));
    System.out.println("对小数进行四舍五入的结果" + Math.round(-8.6));
    System.out.println("求两个数的较大值" + Math.max(1, 2));
    System.out.println("求两个数的较小值" + Math.min(1, 2));
    System.out.println("随机数 大于等于0,小于1.0" + Math.random());
  }
}