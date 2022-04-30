/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-01-29 16:15:27
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-01-29 18:50:23
 */
package project2Text2.uti;

import java.util.Scanner;


public class CMUtility {
    private static Scanner scanner = new Scanner (System.in);

    /**
     * @description: 界面选择（1-5）
     * @param {*}
     * @return {char}返回选择的数字
     * @author: 阳秦林
     */    
    public static char readMenuSelection (){
        char a;
        for (;;){
            a = readKeyBoard(1, false).charAt(0);
            if (a != '1' && a != '2' && a !='3' && a != '4' && a!='5'){
                System.out.println("请输入正确的数字：");
            }
            else {break;}
        }
        return a;
    }
    
    /**
     * @description: 输入字符（不大于1），返回该字符
     * @param {*}
     * @return {*}
     * @author: 阳秦林
     */    
    public static char readChar() {
        return readKeyBoard(1, false).charAt(0);
    }
    
    public static char readChar(char defaultChar) {
        String str = readKeyBoard(1, false);
        return  (str.length() == 0 ? defaultChar : str.charAt(0));
    }

    /**
     * @description: 输入数字（不大于2）,返回数字
     * @param {*}
     * @return {int}返回数字
     * @author: 阳秦林
     */    
    public static int readInt (){
        int a;
        for (;;){
            try{
                a = Integer.parseInt(readKeyBoard(2, false));
                break;
            }
            catch (NumberFormatException e){
                System.out.println("数字输入错误，请重试：");
            }
        }
        return a;
    }

    /**
     * @description: 输入数字（不大于2），当不输入时，直接返回defaultInt，输入则返回输入的数字
     * @param {int} defaultInt：不输入返回的值
     * @return {int}返回数字
     * @author: 阳秦林
     */    
    public static int readInt (int defaultInt){
        int a;
        for (;;){
            String str = readKeyBoard(2,true);
            if (str.equals("")){
                return defaultInt;
            }
            try{
                a = Integer.parseInt(str);
                break;
            }
            catch (NumberFormatException e){
                System.out.println("数字输入错误，请重试：");
            }
        }
        return a;
    }

    private static String readKeyBoard(int limit,boolean blankReturn){
        String line  = "";
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            if (line.length() == 0){
                if (blankReturn) return line;
                else continue;
            }
            if (line.length() < 1 || line.length() > limit){
                System.out.println("输入的数（不大于）+limit"+"请重新输入：");
                continue;
            }
            break;
        }
        return line;
    }
}