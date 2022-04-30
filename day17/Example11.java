/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-18 18:51:02
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-19 12:40:13
 */
package day17;

import java.io.File;

public class Example11 {
  public static void main(String[] args) {
    File file = new File("day17\\text.txt");
    System.out.println("文件名:" + file.getName());
    System.out.println("文件的相对路径:" + file.getPath());
    System.out.println("文件的绝对路径:" + file.getAbsolutePath());
    System.out.println("文件的父路径：" + file.getParent());
    System.out.println(file.canRead() ? "可读" : "不可读");
    System.out.println(file.canWrite() ? "可写" : "不可写");
    System.out.println(file.isFile() ? "是文件" : "不是文件");
    System.out.println(file.isDirectory() ? "是目录" : "不是目录");
    System.out.println(file.isAbsolute() ? "是绝对路径" : "不是绝对路径");
    System.out.println("最后修改时间：" + file.lastModified());
    System.out.println("文件大小：" + file.length() + "字节");
    System.out.println("是否成功删除文件" + (file.delete() ? "是" : "否"));
    System.out.println(file.exists() ? "文件存在" : "文件不存在");

  }
}