/*
 * @Description: ����ӽ�������100��֮���Ǽ��꼸�¼��գ�����ʽ����xxxx��xx��xx��xx��xx��ʱ���֣����
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-09 13:41:06
 * @LastEditors: ������
 * @LastEditTime: 2022-04-09 13:54:57
 */
package javaStudy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class text_time {
  //����ӽ�������100��֮���Ǽ��꼸�¼��գ�����ʽ����xxxx��xx��xx��xx��xx��ʱ���֣����
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.DATE, 100);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��HH��mm");
    System.out.println(sdf.format(calendar.getTime()));
  }
}