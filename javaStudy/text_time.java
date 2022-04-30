/*
 * @Description: 计算从今天算起，100天之后是几年几月几日，并格式化成xxxx年xx月xx日xx：xx（时：分）输出
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-09 13:41:06
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-09 13:54:57
 */
package javaStudy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class text_time {
  //计算从今天算起，100天之后是几年几月几日，并格式化成xxxx年xx月xx日xx：xx（时：分）输出
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DATE, 100);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH：mm");
    System.out.println(sdf.format(calendar.getTime()));
  }
}