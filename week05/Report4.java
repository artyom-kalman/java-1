import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("구매 금액 : ");
    int amount = keyboard.nextInt();
    System.out.print("회원입니까? (true/false) : ");
    boolean member = keyboard.nextBoolean();

    if (amount < 0) {
        System.out.println("오류: 금액은 음수일 수 없습니다.");
    } else {
        boolean freeShipping = amount >= 50000 || (member && amount >= 30000);
        System.out.println(freeShipping ? "무료 배송입니다." : "배송비가 있습니다.");
    }

    keyboard.close();
}
