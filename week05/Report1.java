import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("정수 3개 입력 : ");
    int a = keyboard.nextInt();
    int b = keyboard.nextInt();
    int c = keyboard.nextInt();

    boolean allPositive = a > 0 && b > 0 && c > 0;
    boolean hasNegative = a < 0 || b < 0 || c < 0;
    boolean allZero = !(a != 0 || b != 0 || c != 0);

    if (allPositive) {
        System.out.println("모두 양수");
    } else if (hasNegative) {
        System.out.println("음수 포함");
    } else if (allZero) {
        System.out.println("모두 0");
    }

    keyboard.close();
}
