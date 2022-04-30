/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-21 18:52:04
 * @LastEditors: ������
 * @LastEditTime: 2022-04-22 15:21:58
 */
package day17;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Example18 {
  public static void main(String[] args) throws Exception {
    RandomAccessFile infile = new RandomAccessFile("day17\\1 (1).jpg", "rw");
    FileChannel inChannel = infile.getChannel();
    RandomAccessFile outfile = new RandomAccessFile("day17\\1 (2).jpg", "rw");
    FileChannel outChannel = outfile.getChannel();
    long transferto = inChannel.transferTo(0, inChannel.size(), outChannel);
    if (transferto > 0) {
      System.out.println("���Ƴɹ�");
    }
    infile.close();
    inChannel.close();
    outfile.close();
    outChannel.close();
  }
}