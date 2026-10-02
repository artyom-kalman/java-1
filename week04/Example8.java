import java.util.Scanner;

void main() {
    Scanner s = new Scanner(System.in);
    int base;
    int height;

    System.out.print("Enter base: ");
    base = s.nextInt();

    System.out.print("Enter height: ");
    height = s.nextInt();

    float area = base * height / 2;

    System.out.printf("Base: %dCm\n", base);
    System.out.printf("Height: %dCm\n", height);
    System.out.printf("Area: %f\n", area);
}
