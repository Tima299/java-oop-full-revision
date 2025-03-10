package sg.edu.ntu.chapterTwo.twoFive;

public class TestMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Tan Ah Kow", 10);
        Account a1 = new Account(1, c1, 1000);
        System.out.println(a1);
        a1.deposit(1000).withdraw(500).deposit(2000).withdraw(3000);
        System.out.println(a1);

        Customer c2 = new Customer(2, "Kim Kow", 20);
        Account a2 = new Account(2, c2);
        System.out.println(a2);
        a2.deposit(500).withdraw(1000).deposit(500).withdraw(500);
        System.out.println(a2);

    }
}
