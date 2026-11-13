public class Question5 {
    public static void main(String[] args) {
        final double PROFIT_RATE = 0.3;
        final double TAX_RATE = 0.1;
        int cost = 1015000;

        int price = (int) (cost * (1 + PROFIT_RATE));
        int salesTax = (int) (price * TAX_RATE);
        int purchaseTax = (int) (cost * TAX_RATE);
        int payTax = salesTax - purchaseTax;

        System.out.println("납부 세액");
        System.out.printf("매입원가: %,d원%n", cost);
        System.out.printf("정가: %,d원%n", price);
        System.out.printf("매출세액: %,d원%n", salesTax);
        System.out.printf("매입세액: %,d원%n", purchaseTax);
        System.out.printf("납부세액: %,d원%n", payTax);
    }
}
