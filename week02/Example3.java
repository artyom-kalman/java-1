import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius;

    System.out.print("Enter radius: ");
    radius = keyboard.nextInt();

    double area = Math.PI * radius * radius;

    System.out.printf("Radius: %,d Cm, area: %,.2f \u33a0\n", radius, area);
}
