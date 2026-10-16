import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int price;
    char grade;
    double discountRate, discountedPrice;

    System.out.print("상품 가격 입력 : ");
    price = keyboard.nextInt();

    System.out.print("회원 등급을 입력(VIP, GOLD, SILVER, NONE) : ");
    grade = keyboard.next().charAt(0);

    discountRate = grade == 'V' ? 0.20 :
          grade == 'G' ? 0.15 : grade == 'S' ? 0.10 : 0.0;
    String gradeName = grade == 'V' ? "VIP" :
          grade == 'G' ? "GOLD" : grade == 'S' ? "SILVER" : "NONE";

    discountedPrice = price * (1 - discountRate);
    discountedPrice = (discountedPrice >= 100000) ?
            discountedPrice * 0.95 : discountedPrice;

    System.out.printf("상품 가격: %,d원\n", price);
    System.out.printf("회원 등급 : %s, 할인율: %.0f%%\n",
                                 gradeName, discountRate * 100);
    System.out.printf("최종 결제 금액 : %,d원\n", (int) discountedPrice);
}
