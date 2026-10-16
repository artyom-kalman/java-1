import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    final int BASE = 3000;
    final int EXTRA_PER_KM = 500;

    System.out.print("나이 입력 : ");
    int age = keyboard.nextInt();
    System.out.print("이동 거리(km) 입력 : ");
    int distance = keyboard.nextInt();

    int extra = (distance > 10) ? (distance - 10) * EXTRA_PER_KM : 0;
    int fare = BASE + extra;
    fare = (age >= 65) ? fare / 2 :
          (age <= 12) ? fare * 70 / 100 : fare;

    System.out.printf("요금 : %,d원\n", fare);
}
