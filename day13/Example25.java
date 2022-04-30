/*
 * @Description: 对象名引用方法
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-20 12:10:47
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-20 12:43:57
 */
package day13;

@FunctionalInterface
interface Printable {
  void print(String str);
}

class StringUtils {
  public void printUppercase(String str) {
    System.out.println(str.toUpperCase());

  }
}

public class Example25 {
  private static void printUpper(String text, Printable printable) {
    printable.print(text);
  }

  public static void main(String[] args) {
    StringUtils stringutils = new StringUtils();
    printUpper("Heee", t -> stringutils.printUppercase(t)); // lambad
    printUpper("DDWa", stringutils::printUppercase);// 方法引用
  }
}
/*
 * @Description:
 * 
 * @Version: 2.0
 * 
 * @Autor: 阳秦林
 * 
 * @Date: 2022-03-20 12:10:47
 * 
 * @LastEditors: 阳秦林
 * 
 * @LastEditTime: 2022-03-20 12:10:47
 */
