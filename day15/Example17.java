/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-28 22:57:55
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-29 22:16:26
 */
package day15;

import java.util.Calendar;

public class Example17 {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2018, 1, 1);
    calendar.add(Calendar.YEAR, 100);
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1;
    int date = calendar.get(Calendar.DATE);
    int hour = calendar.get(Calendar.HOUR);
    System.out.println(year);
    System.out.println(month);
    System.out.println(date);
    System.out.println(hour);
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-03-28 22:57:55
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-03-28 22:57:55
  */
