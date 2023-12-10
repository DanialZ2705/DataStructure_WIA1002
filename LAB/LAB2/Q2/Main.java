/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q2;

import java.util.Date;

/**
 *
 * @author mhmdd
 */

class Account{
    
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0.1;
    private Date dateCreated;
    
    public Account(){
        id = 0;
        balance = 0.0;
        dateCreated = new Date();
    }
    
    public Account(int id, double balance){
        id = id;
        balance = balance;
        dateCreated = new Date();
    }
    
    public int getId(){
        return id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    
    void setId(int id){
        this.id = id;
    }
    
    void setBalance(double balance){
        this.balance = balance;
    }
    
    void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    double getMonthlyInterestRate(){
        double monthlyInterestRate = annualInterestRate/12;
        return monthlyInterestRate;
    }
    
    double getMonthlyInterest(){
        double monthlyInterestRate = getMonthlyInterestRate();
        return balance * monthlyInterestRate / 100;
    }
    
    double withdraw(double moneyOut){
        if(moneyOut < balance){
            double newBalance = balance - moneyOut;
        return newBalance;
        }else
            return -1;
    }
    
    double deposit(double moneyIn){
        if(moneyIn > 0){
        double newBalance = balance + moneyIn;
        return newBalance;
        }else 
            return -1;
    }
    
    public void statement() {
        System.out.println("Account ID: " + id);
        System.out.println("Balance: $" + balance);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Date Created: " + dateCreated);
    }
    
}

public class Main {
    
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setId(1122);
        account1.setBalance(20000);
        account1.setAnnualInterestRate(4.5);
        
        account1.statement();
        
        account1.withdraw(2500);
        
        account1.deposit(3000);
        
        System.out.println("The new balance is after withdrawing is " + account1.withdraw(2500));
        System.out.println("The new balance is after depositing is " + account1.deposit(3000));
        
        System.out.println("The monthly interest is " + account1.getMonthlyInterest());
    }
    
}
