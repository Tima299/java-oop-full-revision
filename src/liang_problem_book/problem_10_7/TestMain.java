package liang_problem_book.problem_10_7;

public class TestMain {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter an index: ");
        int index = input.nextInt();

        System.out.println("Account at index " + index + " is: " + accounts[index]);

        System.out.print("Enter an amount to withdraw: ");
        double amount = input.nextDouble();
        accounts[index].withdraw(amount);

        System.out.print("Enter an amount to deposit: ");
        amount = input.nextDouble();
        accounts[index].deposit(amount);

        System.out.println("Account at index " + index + " is: " + accounts[index]);
    }
}
