import java.util.Scanner;

void main() {
    Scanner s = new Scanner(System.in);
    float exchange;
    int money;

    System.out.print("Enter exchange rate: ");
    exchange = s.nextFloat();

    System.out.print("Enter money: ");
    money = s.nextInt();

    float dollar = money / exchange;

    System.out.printf("%d, %f, %f", money, exchange, dollar);
}
