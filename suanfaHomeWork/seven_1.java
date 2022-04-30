/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-04-24 19:24:20
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-04-24 20:09:58
 */
package suanfaHomeWork;

public class seven_1 {
  private static int changeTheCoin(int money) {
    int sum = 0;
    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 50; j++) {
        for (int k = 0; k < 20; k++) {
          if (i + j * 2 + k * 5 == money) {
            System.out.println("一块要：" + i + "两块要：" + j + "五块要：" + k);
            sum++;
          }
        }
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println("一共有" + changeTheCoin(10));
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: 阳秦林
  * 
  * @Date: 2022-04-24 19:24:20
  * 
  * @LastEditors: 阳秦林
  * 
  * @LastEditTime: 2022-04-24 19:24:20
  */
