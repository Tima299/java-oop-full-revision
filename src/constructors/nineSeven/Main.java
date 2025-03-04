package constructors.nineSeven;

public class Main {
    public static void main(String[] args) {
        // Test Case 1: Default Account
        Account defaultAccount = new Account();
        System.out.println("Default Account:");
        printAccountDetails(defaultAccount);

        // Test Case 2: Account with Specific ID and Balance
        Account account1 = new Account(1122, 20_000);
        account1.setAnnualInterestRate(4.5);
        account1.withdraw(2_500);
        account1.deposit(3_000);
        System.out.println("\nAccount 1 (ID: 1122, Balance: $20,000, Annual Interest Rate: 4.5%):");
        printAccountDetails(account1);

        // Test Case 3: Account with Zero Balance
        Account zeroBalanceAccount = new Account(2001, 0);
        zeroBalanceAccount.setAnnualInterestRate(3.0);
        System.out.println("\nAccount 2 (ID: 2001, Zero Balance, Annual Interest Rate: 3%):");
        printAccountDetails(zeroBalanceAccount);

        // Test Case 4: Account with Large Balance and High Interest Rate
        Account highBalanceAccount = new Account(7777, 1_000_000);
        highBalanceAccount.setAnnualInterestRate(12.0);
        highBalanceAccount.withdraw(50_000);
        highBalanceAccount.deposit(100_000);
        System.out.println("\nAccount 3 (ID: 7777, Large Balance, High Interest Rate 12%):");
        printAccountDetails(highBalanceAccount);

        // Test Case 5: Edge Case - Withdraw More Than Balance
        Account negativeBalanceTest = new Account(3003, 5_000);
        negativeBalanceTest.withdraw(10_000); // Expect negative balance
        System.out.println("\nAccount 4 (ID: 3003, Withdraw More Than Balance):");
        printAccountDetails(negativeBalanceTest);

        // Test Case 6: Edge Case - Deposit and Withdraw Exact Balance
        Account exactBalanceTest = new Account(4004, 10_000);
        exactBalanceTest.withdraw(10_000);
        exactBalanceTest.deposit(10_000);
        System.out.println("\nAccount 5 (ID: 4004, Withdraw and Deposit Exact Balance):");
        printAccountDetails(exactBalanceTest);
    }

    public static void printAccountDetails(Account account) {
        System.out.println("Account ID: " + account.getId());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate() + "%");
        System.out.println("Monthly Interest Rate: " + account.getMonthlyInterestRate());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}
