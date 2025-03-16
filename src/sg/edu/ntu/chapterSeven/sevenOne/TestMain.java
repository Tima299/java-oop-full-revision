package sg.edu.ntu.chapterSeven.sevenOne;

import sg.edu.ntu.chapterOne.oneSeven.Date;

public class TestMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Farrukh");
        customer.setMember(true);
        customer.setMemberType("premium");
        Visit visit = new Visit(customer.getName(), new Date(15, 03, 2025));
        visit.setServiceExpense(100);
        visit.setProductExpense(100);
        System.out.println(visit);
       //tests Disount rates
        DiscountRate discountRate = new DiscountRate();
        System.out.println("\nDiscount Rates");
        System.out.println(discountRate.getServiceDiscountRate("premium"));
        System.out.println(discountRate.getProductDiscountRate("premium"));
    }
}
