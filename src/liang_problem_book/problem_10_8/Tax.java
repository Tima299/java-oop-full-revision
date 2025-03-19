package liang_problem_book.problem_10_8;

public class Tax {
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
        this.filingStatus = 0;
        this.taxableIncome = 0;
        this.brackets = new int[][] {
            {8350, 33950, 82250, 171550, 372950}, // Single filer
            {16700, 67900, 137050, 208850, 372950}, // Married jointly
            {8350, 33950, 68525, 104425, 186475}, // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
        };
        this.rates = new double[] {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0;
        double income = taxableIncome;
        int i = 0;
        while (income > brackets[filingStatus][i]) {
            if (i == 0) {
                tax += brackets[filingStatus][i] * rates[i];
            } else {
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
            }
            i++;
        }
        tax += (income - brackets[filingStatus][i - 1]) * rates[i];
        return tax;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    public String toString() {
        return "Tax{" +
                "filingStatus=" + filingStatus +
                ", brackets=" + brackets +
                ", rates=" + rates +
                ", taxableIncome=" + taxableIncome +
                '}';
    }
}
