package tinyProjects.bank_system.BankServices;

import tinyProjects.bank_system.library.list.MyArrayList;
import tinyProjects.bank_system.library.list.MyList;


public class Account {
	private int code;
	private String ownerName;
	private int amount;
	private int date;
	private MyList movements = new MyArrayList();
	private static int count = 0;
	{
		count++;
	}

	public Account(int lastCode, String name, int date, double initial) {
		this.code = count;
		this.ownerName = name;
		this.date = date;
		this.amount = (int) initial;
	}

	public String toString() {
		return "Account: " + code + " " + ownerName + " " + amount + " " + date;
	}

	public MyList getMovements() {
		return movements;
	}

	public MyList getDeposits() {
		MyList deposits = new MyArrayList();
		for (int i = 0; i < movements.size(); i++) {
			Object op = movements.get(i);
		if (op instanceof Deposit) {
				deposits.add(op);
			}
		}
		return deposits;
	}

	public MyList getWithdrawals() {
		MyList withdrawals = new MyArrayList();
		for (int i = 0; i < movements.size(); i++) {
			Object op = movements.get(i);
			if (op instanceof Withdrawal) {
				withdrawals.add(op);
			}
		}
		return withdrawals;
	}

	public int getCode() {
		return code;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public int getAmount() {
		return amount;
	}

	public int getDate() {
		return date;
	}

	public double getBalance() {
		double balance = 0;
		for (int i = 0; i < movements.size(); i++) {
			Object op = movements.get(i);
			if (op instanceof Deposit) {
				balance += ((Deposit) op).getValue();
			} else if (op instanceof Withdrawal) {
				balance -= ((Withdrawal) op).getValue();
			}
		}
		return balance;
	}

	public void withdraw(int date, double balance) {
		Withdrawal w = new Withdrawal(date, balance);
		movements.add(w);
		this.amount -= balance;
		this.date = date;
	}

	public int getLastOpDate() {
		int lastDate = 0;
		for (int i = 0; i < movements.size(); i++) {
			Object op = movements.get(i);
			if (op instanceof Deposit) {
				lastDate = Math.max(lastDate, ((Deposit) op).getDate());
			} else if (op instanceof Withdrawal) {
				lastDate = Math.max(lastDate, ((Withdrawal) op).getDate());
			}
		}
		return lastDate;
	}

	public void deposit(int date, double value) {
		Deposit d = new Deposit(date, value);
		movements.add(d);
		this.amount += value;
		this.date = date;
	}
}
