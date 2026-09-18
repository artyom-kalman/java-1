import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius;

    System.out.print("Enter radius: ");
    radius = keyboard.nextInt();

    double area = Math.PI * radius * radius;
    double square = 2 * radius * 2 * radius;
    double target = square - area;

    System.out.printf("Radius: %,d Cm\n", radius);
    System.out.printf("Square: %,.2f \u33a0\n", square);
    System.out.printf("Circle: %,.2f \u33a0\n", area);
    System.out.printf("Target: %,.2f \u33a0\n", target);
}
