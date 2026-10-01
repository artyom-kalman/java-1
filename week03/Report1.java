import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    int first;
    int second;

    System.out.print("첫번째 숫자를 입력하세요 ");
    first = keyboard.nextInt();

    System.out.print("두번째 숫자를 입력하세요 ");
    second = keyboard.nextInt();

    System.out.printf("%d + %d = %d\n", first, second, first + second);

    keyboard.close();
}
