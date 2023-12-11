package lab4q1;

import java.util.Date;
import java.util.ArrayList;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;
    public ArrayList<Transaction> transaction = new ArrayList<>();
    
    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0.1;
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new java.util.Date();
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

    public Date getDateCreated() {
        return dateCreated;
    }
    
    public double getMonthlyInterestRate() {
        double monthlyInterestRate = this.annualInterestRate / 12;
        return monthlyInterestRate;
    }
    
    public double getMonthlyInterest() {
        double monthlyInterest = balance * getMonthlyInterestRate() / 100;
        return monthlyInterest;
    }
    
    public void withdraw(char type, double amount) {
        balance -= amount;
        type = 'w';
        transaction.add(new Transaction(type, balance, amount, " "));
    }
    
    public void deposit(char type, double amount) {
        balance += amount;
        type = 'd';
        transaction.add(new Transaction(type, balance, amount, " "));
    }
    
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("ID: ").append(id).append("\n")
            .append("Balance: ").append(balance).append("\n")
            .append("Annual Interest Rate: ").append(annualInterestRate).append("\n")
            .append("Date Created: ").append(dateCreated).append("\n\n")
            .append("Transaction History: \n\n");

    for (int i = 0; i < transaction.size(); i++) {
        Transaction currentTransaction = transaction.get(i);
        sb.append(currentTransaction.toString()).append("\n");
    }

    return sb.toString();
}

}
