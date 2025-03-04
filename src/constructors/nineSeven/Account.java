package constructors.nineSeven;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        dateCreated = new java.util.Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
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

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 /100;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }
}
