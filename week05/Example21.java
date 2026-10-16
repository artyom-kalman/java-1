import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("나이 입력 : ");
    int age = keyboard.nextInt();

    int fee = (age <= 7 || age >= 65) ? 0 :
          (age <= 13) ? 3000 :
          (age <= 19) ? 4000 : 5000;

    System.out.printf("입장료 : %,d원\n", fee);
}
