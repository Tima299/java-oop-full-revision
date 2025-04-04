package tinyProjects.bank_system.BankServices;


import tinyProjects.bank_system.library.list.MyArrayList;
import tinyProjects.bank_system.library.list.MyList;

public class Bank {
	private String name;
	private MyList accounts = new MyArrayList();
	private int lastCode = 0;
	public Bank(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int createAccount(String ownerName, int date, double initial) {
		lastCode++;
		Account acc = new Account(lastCode, ownerName, date, initial);
		accounts.add(acc);
		System.out.println("Created: " + acc);
		System.out.println("Accounts size: " + accounts.size());
		return lastCode;
	}

	public Account deleteAccount(int code, int date) throws InvalidCode {
		Account acc = getAccount(code);
		double balance = acc.getBalance();
		acc.withdraw(date , balance);
		accounts.remove(acc);
		return acc;
	}

	public Account getAccount(int code) throws InvalidCode {
		for (int i = 0; i < accounts.size(); i++) {
			Account acc = (Account) accounts.get(i);
			if (acc.getCode() == code) {
				return acc;
			}
		}
		throw new InvalidCode();
	}

	public void deposit(int code, int date, double value) throws InvalidCode {
		Account acc = getAccount(code);
		if (date < acc.getLastOpDate()) {
			date = acc.getLastOpDate();
		}
		acc.deposit(date, value);
	}

	public void withdraw(int code, int date, double value) throws InvalidCode {
		Account acc = getAccount(code);
		if (date < acc.getLastOpDate()) {
			date = acc.getLastOpDate();
		}
		if (value > acc.getBalance()) {
			throw new InvalidCode("Insufficient funds");
		}
		acc.withdraw(date, value);

	}

	public void transfer(int fromCode, int toCode, int date, double value) throws InvalidCode {
		Account fromAcc = getAccount(fromCode);
		Account toAcc = getAccount(toCode);

		if (date < fromAcc.getLastOpDate()) {
			date = fromAcc.getLastOpDate();
		}

		if ( value > fromAcc.getBalance()) {
			throw new InvalidCode("Insufficient funds for transfer");
		}
		fromAcc.withdraw(date, value);
		toAcc.withdraw(date, value);
	}

	public double getTotalDeposit() {
		return 0.0;
	}

	public MyList getAccounts() {
		return accounts;
	}


	public MyList getZeroAccounts() {
		MyList zeroAccounts = new MyArrayList();
		for (int i = 0; i < accounts.size(); i++) {
			Account acc = (Account) accounts.get(i);
			if (acc.getBalance() == 0) {
				zeroAccounts.add(acc);
			}
		}
		return zeroAccounts;
	}

	public MyList getAccountsByBalance(double low, double high) {
		MyList filteredAccounts = new MyArrayList();
		for (int i = 0; i < accounts.size(); i++) {
			Account acc = (Account) accounts.get(i);
			if (acc.getBalance() >= low && acc.getBalance() <= high) {
				filteredAccounts.add(acc);
			}
		}
		return filteredAccounts;
	}

	public long getNumberHigher(double min) {
		return 0;
	}


	public class InvalidCode extends Throwable {
		public InvalidCode() {
			super("Invalid Code is invalid");
		}

		public InvalidCode(String message) {
			super(message);
		}
	}
}