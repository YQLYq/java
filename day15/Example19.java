/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-03-30 10:43:37
 * @LastEditors: ������
 * @LastEditTime: 2022-03-30 17:40:57
 */

package day15;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class Example19 {
  public static void main(String[] args) {
    // clock ӵ�л�ȡָ��ʱ���ĵ�ǰ���ڡ�ʱ��
    Clock clock = Clock.systemUTC();// UTC����ʱ�� 8Сʱ��
    System.out.println("utcʱ��" + clock.instant());
    System.out.println("utc����" + clock.millis());

    // Duration ��ʾ����ʱ�䣬ofxxx��ofDays,ofMillis,ofMonth,ofSecond����ȡָ��ʱ��
    Duration duration = Duration.ofDays(1);
    System.out.println("һ��Сʱ" + duration.toHours());
    System.out.println("һ�����" + duration.toMinutes());
    System.out.println("һ����" + duration.toMillis());

    // Instant ��ʾ����ʱ�� �������� now����ȡ��plusXxx �� minusXxx ��
    Instant instant = Instant.now();
    System.out.println("��" + instant.plusSeconds(3600));
    System.out.println("��" + instant.minusSeconds(3600));

  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: ������
  * 
  * @Date: 2022-03-30 10:43:37
  * 
  * @LastEditors: ������
  * 
  * @LastEditTime: 2022-03-30 10:43:37
  */
