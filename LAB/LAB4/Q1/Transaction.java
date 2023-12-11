/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4q1;

/**
 *
 * @author mhmdd
 */
public class Transaction<transaction> extends Account{
    private char type;
    private double amount;
    private double balance;
    private String description;
    public String name;
    
    public String Describe(){
        StringBuilder sb = new StringBuilder();
        switch(type){
            case 'w':
                name = "withdrawn";
                break;
            case 'd':
                name = "deposited";
                break;
        }
        sb.append("RM ").append(balance).append(" is successfully ").append(name);
        description = sb.toString();
        return description;
    }
    
    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    public String Process(char type){
        switch(type){
            case 'w':
                name = "Withdraw";
                return name;
            case 'd':
                name = "Deposit";
                return name;
        }
        return name;
    }
    
    public String toString(){
        StringBuilder stb = new StringBuilder();
        stb
                .append("Type of transaction: ").append(Process(type)).append("\n")
                .append("Transaction amount: ").append(balance).append("\n")
                .append("Balance: ").append(amount).append("\n")
                .append("Description: ").append(Describe()).append("\n")
                ;
        return stb.toString();
    }
}
