package liang_problem_book.problem_10_8;

import constructors.nineTwo.Main;

import javax.print.attribute.standard.PagesPerMinute;

public class TestMain {
    public static void main(String[] args) {
        Tax tax = new Tax();
        tax.setFilingStatus(0);
        tax.setTaxableIncome(50000);
        System.out.println("Tax is " + tax.getTax());

        tax.setFilingStatus(1);

        tax.setBrackets(new int[][]{{27050, 65550, 136750, 297350}, {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675}, {36250, 93650, 151650, 297350}});


        tax.setRates(new double[]{0.15, 0.275, 0.305, 0.355, 0.391});

        tax.setTaxableIncome(50000);

        System.out.println("Tax is " + tax.getTax());

        tax.setFilingStatus(2);

        tax.setBrackets(new int[][]{{45200, 109250, 166500, 297350}, {22600, 54625, 83250, 148675}, {36250, 93650, 151650, 297350}, {45200, 109250, 166500, 297350}});

        tax.setRates(new double[]{0.15, 0.275, 0.305, 0.355, 0.391});

        tax.setTaxableIncome(50000);

        System.out.println("Tax is " + tax.getTax());

        tax.setFilingStatus(3);
        
        tax.setRates(new double[]{0.15, 0.275, 0.305, 0.355, 0.391});

        tax.setTaxableIncome(50000);

        System.out.println("Tax is " + tax.getTax());

    }
}
