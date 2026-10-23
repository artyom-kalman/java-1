import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int num;

    String result;
    String result1;
    char result2;
    String result2_1;

    String result3;
    String result4;
    char result5e

    System.out.print("Enter a positive integer: ");
    num = keyboard.nextInt();

    if (num % 2 == 0) {
        result = String.format("%d is even.", num);
        result1 = "even";
        result2 = 'E';
    } else {
        result = String.format("%d is odd.", num);
        result1 = "odd";
        result2 = 'O';
    }

    switch (num % 2) {
        case 1:
            result2_1 = "odd";
            break;
        default:
            result2_1 = "";
            break;
        case 0:
            result2_1 = "even";
            break;
    }

    result3 = (num % 2 == 0) ? String.format("%d is even.", num) :
            String.format("%d is odd.", num);
    result4 = (num % 2 == 0) ? "even" : "odd";
    result5 = (num % 2 == 0) ? 'E' : 'O';

    System.out.println(result);
    System.out.printf("%d is %s.\n", num, result1);
    System.out.printf("%d is %c.\n", num, result2);
    System.out.println(result2_1);

    System.out.println(result3);
    System.out.printf("%d is %s.\n", num, result4);
    System.out.printf("%d is %c.\n", num, result5);
}
