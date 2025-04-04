package tinyProjects.bank_system.BankServices;

public class Withdrawal {
    private int date;
    private double value;

    public Withdrawal(int date, double value) {
        this.date = date;
        this.value = value;
    }

    public String toString() {
        return "Withdrawal: " + date + " " + value;
    }

    public int getDate() {
        return date;
    }

    public double getValue() {
        return value;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean equals(Withdrawal withdrawal) {
        return this.date == withdrawal.date && this.value == withdrawal.value;
    }

    public int compareTo(Withdrawal withdrawal) {
        if (this.date < withdrawal.date) {
            return -1;
        } else if (this.date > withdrawal.date) {
            return 1;
        } else {
            if (this.value < withdrawal.value) {
                return -1;
            } else if (this.value > withdrawal.value) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public boolean isDeposit() {
        return value > 0;
    }

    public boolean isWithdrawal() {
        return value < 0;
    }

    public boolean isTransfer() {
        return value == 0;
    }

}
