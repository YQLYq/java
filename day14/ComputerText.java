/*
 * @Description: 
 * @Version: 2.0
 * @Autor: —Ù«ÿ¡÷
 * @Date: 2022-03-24 09:58:02
 * @LastEditors: —Ù«ÿ¡÷
 * @LastEditTime: 2022-03-24 10:04:45
 */
package day14;

public class ComputerText {
  public static void main(String[] args) {
    Mouse mouse = new Mouse();
    KeyBoard keyBoard = new KeyBoard();
    Mic mic = new Mic();
    Computer computer = new Computer();
    computer.add(mouse);
    computer.add(keyBoard);
    computer.add(mic);
    computer.poweron();
    computer.powerOff();
  }
}/*
  * @Description:
  * 
  * @Version: 2.0
  * 
  * @Autor: —Ù«ÿ¡÷
  * 
  * @Date: 2022-03-24 09:58:02
  * 
  * @LastEditors: —Ù«ÿ¡÷
  * 
  * @LastEditTime: 2022-03-24 09:58:03
  */
