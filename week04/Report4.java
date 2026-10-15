import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    int total;
    int amount;
    int tax;

    System.out.print("판매금액 : ");
    total = keyboard.nextInt();

    amount = (int) Math.round(total / 1.1);
    tax = total - amount;

    System.out.printf("금액 : %,d원\n", amount);
    System.out.printf("세금 : %,d원\n", tax);

    keyboard.close();
}
