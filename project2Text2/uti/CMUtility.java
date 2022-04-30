/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-01-29 16:15:27
 * @LastEditors: ������
 * @LastEditTime: 2022-01-29 18:50:23
 */
package project2Text2.uti;

import java.util.Scanner;


public class CMUtility {
    private static Scanner scanner = new Scanner (System.in);

    /**
     * @description: ����ѡ��1-5��
     * @param {*}
     * @return {char}����ѡ�������
     * @author: ������
     */    
    public static char readMenuSelection (){
        char a;
        for (;;){
            a = readKeyBoard(1, false).charAt(0);
            if (a != '1' && a != '2' && a !='3' && a != '4' && a!='5'){
                System.out.println("��������ȷ�����֣�");
            }
            else {break;}
        }
        return a;
    }
    
    /**
     * @description: �����ַ���������1�������ظ��ַ�
     * @param {*}
     * @return {*}
     * @author: ������
     */    
    public static char readChar() {
        return readKeyBoard(1, false).charAt(0);
    }
    
    public static char readChar(char defaultChar) {
        String str = readKeyBoard(1, false);
        return  (str.length() == 0 ? defaultChar : str.charAt(0));
    }

    /**
     * @description: �������֣�������2��,��������
     * @param {*}
     * @return {int}��������
     * @author: ������
     */    
    public static int readInt (){
        int a;
        for (;;){
            try{
                a = Integer.parseInt(readKeyBoard(2, false));
                break;
            }
            catch (NumberFormatException e){
                System.out.println("����������������ԣ�");
            }
        }
        return a;
    }

    /**
     * @description: �������֣�������2������������ʱ��ֱ�ӷ���defaultInt�������򷵻����������
     * @param {int} defaultInt�������뷵�ص�ֵ
     * @return {int}��������
     * @author: ������
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
                System.out.println("����������������ԣ�");
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
                System.out.println("��������������ڣ�+limit"+"���������룺");
                continue;
            }
            break;
        }
        return line;
    }
}