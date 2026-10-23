import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1, num2;
    float result;
    String message;

    System.out.print("Enter numerator: ");
    num1 = keyboard.nextInt();
    System.out.print("Enter denominator: ");
    num2 = keyboard.nextInt();

    result = (float) num1 / num2;

    if (num2 == 0) {
        message = "Cannot calculate";
    } else {
        message = String.format("%d / %d = %.2f", num1, num2, result);
    }

    System.out.println(message);
}
