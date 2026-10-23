import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1, num2, num3;
    int result;

    System.out.print("Enter 3 integers: ");
    num1 = keyboard.nextInt();
    num2 = keyboard.nextInt();
    num3 = keyboard.nextInt();

    if (num1 > num2) {
        if (num1 > num3) {
            result = num1;
        } else {
            result = num3;
        }
    } else if (num2 > num3) {
        result = num2;
    } else {
        result = num3;
    }

    System.out.printf("The largest of %d, %d, %d is %d.\n", num1, num2, num3, result);
}
