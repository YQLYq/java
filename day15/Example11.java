/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-27 19:53:39
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-27 20:15:40
 */
package day15;

public class Example11 {
  public static void main(String[] args) {
    Runtime rt = Runtime.getRuntime();
    System.out.println("处理器的个数" + rt.availableProcessors() + "个");// processors 处理器 availabe 可用的 获取处理器的个数
    System.out.println("空闲内存数" + rt.freeMemory() / 1024 / 1024 + "M"); // Memory 内存
    System.out.println("最大可以内存数"+rt.maxMemory() / 1024 / 1024 + "M");
  }
}