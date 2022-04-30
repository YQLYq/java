/*
 * @Description: 类名引用普通方法
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-20 16:32:18
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-20 16:59:18
 */
package day13;

@FunctionalInterface
interface Printable1 {
  void print(StringUtils1 su, String str);
}

class StringUtils1 {
  public void printUppercase(String str) {
    System.out.println(str.toUpperCase());
  }
}

public class Example27 {
  private static void printUpper(StringUtils1 su, String text, Printable1 pt) {
    pt.print(su, text);
  }

  public static void main(String[] args) {
    printUpper(new StringUtils1(), "text", (Object,t)->Object.printUppercase(t));
    printUpper(new StringUtils1(), "text", StringUtils1::printUppercase);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-20 16:32:18
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-20 16:32:18
  */
