/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-30 10:24:49
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-30 10:31:13
 */
package day15;

import java.util.Calendar;

public class Example18 {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.MONTH, 13);
    System.out.println(calendar.getTime());
    calendar.setLenient(false);
    calendar.set(Calendar.MONTH, 13);
    System.out.println(calendar.getTime());
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-03-30 10:24:49
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-03-30 10:24:49
  */
