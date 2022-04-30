/*
 * @Description: 
 * @Version: 2.0
 * @Autor: 阳秦林
 * @Date: 2022-01-21 11:28:33
 * @LastEditors: 阳秦林
 * @LastEditTime: 2022-01-26 21:50:09
 */

package day10.Account;


public class Account {
    private int id; //账号  
    private double balance;//余额
    private double annualInterestRate;//年利率

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

    public void withdraw (double amount){ //取钱
        if (amount > balance){
            System.out.println("余额不足");
        }
        else {
            balance = balance - amount;
            System.out.println("已取出,当前余额为："+balance);
        }
    }

    public void deposit(double amount) { //存钱
        if (balance >= 0){
            balance = balance + amount;
            System.out.println("已存入，当前余额为："+balance);
        }
       
    }

}