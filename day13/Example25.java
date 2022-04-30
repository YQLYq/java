/*
 * @Description: ���������÷���
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-20 12:10:47
 * @LastEditors: ������
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
    printUpper("DDWa", stringutils::printUppercase);// ��������
  }
}
/*
 * @Description:
 * 
 * @Version: 2.0
 * 
 * @Autor: ������
 * 
 * @Date: 2022-03-20 12:10:47
 * 
 * @LastEditors: ������
 * 
 * @LastEditTime: 2022-03-20 12:10:47
 */
