/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-03-30 10:43:37
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-03-30 17:40:57
 */

package day15;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class Example19 {
  public static void main(String[] args) {
    // clock 拥有获取指定时区的当前日期、时间
    Clock clock = Clock.systemUTC();// UTC世界时间 8小时差
    System.out.println("utc时区" + clock.instant());
    System.out.println("utc毫秒" + clock.millis());

    // Duration 表示持续时间，ofxxx（ofDays,ofMillis,ofMonth,ofSecond）获取指定时间
    Duration duration = Duration.ofDays(1);
    System.out.println("一天小时" + duration.toHours());
    System.out.println("一天分钟" + duration.toMinutes());
    System.out.println("一天秒" + duration.toMillis());

    // Instant 表示具体时间 ，到纳秒 now来获取，plusXxx 加 minusXxx 减
    Instant instant = Instant.now();
    System.out.println("加" + instant.plusSeconds(3600));
    System.out.println("减" + instant.minusSeconds(3600));

  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-03-30 10:43:37
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-03-30 10:43:37
  */
