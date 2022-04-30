/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-26 18:48:17
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-26 19:04:34
 */
package day15;

public class Example07 {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    sb.append("sda");// 添加
    System.out.println(sb);
    sb.insert(3, "dds");// 插入
    System.out.println(sb);
    sb.delete(3, 5);// 删除3到5
    System.out.println(sb);
    sb.deleteCharAt(3);// 删除指定
    System.out.println(sb);
    sb.replace(0, 1, "dddd");//指定的范围替换
    System.out.println(sb);
    sb.setCharAt(0, 'w');//替换
    System.out.println(sb);
    sb.reverse();//反转
    System.out.println(sb);
    sb.delete(0, sb.length());//清除缓冲区
    System.out.println(sb);
  }
}