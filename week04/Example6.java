import java.util.Scanner;

void main() {
    Scanner s = new Scanner(System.in);
    int num1;
    int num2;

    System.out.print("Enter first nubmer: ");
    num1 = s.nextInt();

    System.out.print("Enter second nubmer: ");
    num2 = s.nextInt();

    System.out.printf("%d / %d = %d, %d", num1, num2, num1 / num2, num1 % num2);
}
