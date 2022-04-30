/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-23 10:55:35
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-24 09:29:41
 */
package day14;

public class Exanple29 {

  public static int divide(int x, int y) throws DivideException {
    if (y == 0) {
      throw new DivideException("¥ÌŒÛ");
    }
    int result = x / y;
    return result;
  }

  public static void main(String[] args) {
    try {
      int result = divide(4, 0);
      System.out.println(result);
    } catch (DivideException e) {
      System.out.println(e.getMessage());
    }
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-03-23 10:55:35
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-03-23 10:55:35
  */
