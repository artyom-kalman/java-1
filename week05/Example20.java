import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("나이 입력 : ");
    int age = keyboard.nextInt();

    int fee = (age <= 7 || age >= 65) ? 0 : 5000;
    System.out.printf("입장료 : %,d원\n", fee);
}
