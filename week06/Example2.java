import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    float weight;
    int gold;
    final float UNIT = 3.75f;
    float gram;
    int price;

    System.out.printf("당신의 몸무게 ? ");
    weight = keyboard.nextFloat();
    System.out.printf("금 1돈의 가격 : ");
    gold = keyboard.nextInt();
    gram = weight * 1000;
    price = (int) (gram / UNIT * gold);
    price /= 10000;
    price *= 10000;

    System.out.printf("몸무게 : %.1f Kg(%,.2f g)\n", weight, gram);
    System.out.printf("금 1돈(%.2f g)의 가격 : %,d 원\n", UNIT, gold);
    System.out.printf("몸무게 가격 = %,d 원\n", price);
}
