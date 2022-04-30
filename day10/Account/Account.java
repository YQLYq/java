/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-01-21 11:28:33
 * @LastEditors: ������
 * @LastEditTime: 2022-01-26 21:50:09
 */

package day10.Account;


public class Account {
    private int id; //�˺�  
    private double balance;//���
    private double annualInterestRate;//������

    public Account(){

    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw (double amount){ //ȡǮ
        if (amount > balance){
            System.out.println("����");
        }
        else {
            balance = balance - amount;
            System.out.println("��ȡ��,��ǰ���Ϊ��"+balance);
        }
    }

    public void deposit(double amount) { //��Ǯ
        if (balance >= 0){
            balance = balance + amount;
            System.out.println("�Ѵ��룬��ǰ���Ϊ��"+balance);
        }
       
    }

}