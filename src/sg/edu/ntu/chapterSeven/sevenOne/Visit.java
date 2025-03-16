package sg.edu.ntu.chapterSeven.sevenOne;

import sg.edu.ntu.chapterOne.oneSeven.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date){
        customer = new Customer(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
    public double getTotalExpense(){
        return serviceExpense + productExpense;
    }
    public String toString(){
        return "Name: " + customer.getName() + "\n" + "Date: " + date + "\n" + "Service Expense: " + serviceExpense + "\n" + "Product Expense: " + productExpense + "\n" + "Total Expense: " + getTotalExpense();
    }
}
