package liang_problem_book.problem_10_7;

public class Account {
    /*10.7 (Game: ATM machine) Use the Account class created in Programming Exer-
     cise 9.7 to simulate an ATM machine. Create 10 accounts in an array with id
     0, 1, . . . , 9, and an initial balance of $100. The system prompts the user to
     enter an id. If the id is entered incorrectly, ask the user to enter a correct id.
     Once an id is accepted, the main menu is displayed as shown in the sample
     run. You can enter choice 1 for viewing the current balance, 2 for withdraw-
     ing money, 3 for depositing money, and 4 for exiting the main menu. Once
     you exit, the system will prompt for an id again. Thus, once the system starts,
     it will not stop.*/

    private int id;
    private double balance;
    private static double annualInterestRate;
    private java.util.Date dateCreated;

    public Account() {
        this(0, 100);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }


    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override

    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate + ", dateCreated=" + dateCreated + '}';
    }
}
