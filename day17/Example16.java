/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-21 14:25:40
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-21 18:46:16
 */
package day17;

import java.nio.CharBuffer;

public class Example16 {
  public static void main(String[] args) {
    CharBuffer charbuffer = CharBuffer.allocate(6);
    System.out.println("容量" + charbuffer.capacity());
    System.out.println("界限值" + charbuffer.limit());
    System.out.println("初始位置" + charbuffer.position());
    charbuffer.put("c");
    charbuffer.put("x");
    charbuffer.put("s");
    System.out.println("加入元素的界限值" + charbuffer.limit());
    System.out.println("加入元素的位置" + charbuffer.position());
    charbuffer.flip();
    System.out.println("执行flip的界限值" + charbuffer.limit());
    System.out.println("执行flip的位置" + charbuffer.position());
    System.out.println("取出的第一个元素" + charbuffer.get());
    System.out.println("取出的界限值" + charbuffer.limit());
    System.out.println("取出的位置" + charbuffer.position());
    charbuffer.clear();
    System.out.println("执行clear的界限值" + charbuffer.position());
    System.out.println("执行clear的位置" + charbuffer.limit());
    System.out.println("取出的第一个元素" + charbuffer.get());
    
  }
}