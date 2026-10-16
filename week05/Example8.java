import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    final int APPLE = 500;
    final int PEAR = 600;
    int apple, pear, payment;
    int price, change;
    String result;

    System.out.print("구입한 사과의 개수 입력 : ");
    apple = keyboard.nextInt();
    System.out.print("구입한 배의 개수 입력 : ");
    pear = keyboard.nextInt();
    System.out.print("대금 지급을 위한 지불 금액 : ");
    payment = keyboard.nextInt();

    price = apple * APPLE + pear * PEAR;
    change = payment - price;

    result = (change < 0) ?
       String.format("대금 지급을 위해 %,d 원을 더 주세요\n", -change) :
       String.format("거스름돈은 %,d 원 입니다\n", change);
    System.out.print(result);
}
