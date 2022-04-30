/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-20 11:06:05
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-21 14:17:16
 */
package day17;

import java.io.RandomAccessFile;

public class Example15 {
  public static void main(String[] args) throws Exception {
    RandomAccessFile raf = new RandomAccessFile("day17\\text1.txt", "rw");
    int times = Integer.parseInt(raf.readLine()) - 1;
    if (times > 0) {
      System.out.println("剩余体验时间" + times);
      raf.seek(0);
      raf.write((times + "").getBytes());
    } else {
      System.out.println("没有体验时间了");
    }
    raf.close();
  }
}
/*
 * @Description:
 * 
 * @Version: 2.0
 * 
 * @Autor: 阳秦林
 * 
 * @Date: 2022-04-20 11:06:05
 * 
 * @LastEditors: 阳秦林
 * 
 * @LastEditTime: 2022-04-20 11:06:05
 */
