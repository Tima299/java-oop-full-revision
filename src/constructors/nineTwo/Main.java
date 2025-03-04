package constructors.nineTwo;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.printf("Symbol: %s, Name: %s%n", stock.symbol, stock.name);
        System.out.printf("Price-change percentage: %.2f%%%n", stock.getChangePercent());
    }
}
