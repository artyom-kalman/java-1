import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    double weight;
    double moon;

    System.out.print("몸무게(kg)를 입력하세요 : ");
    weight = keyboard.nextDouble();

    moon = weight * 0.165;

    System.out.printf("지구 몸무게 = %.1fkg, 달에서의 몸무게 = %.1fkg\n", weight, moon);

    keyboard.close();
}
