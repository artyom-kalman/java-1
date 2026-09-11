import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    String name;
    int age;
    double height;
    float weight;

    System.out.println("You name");
    name = scanner.nextLine();

    System.out.printf("%s's age: ", name);
    age = scanner.nextInt();

    System.out.printf("%s's height (e.g. 170.5): ", name);
    height = scanner.nextDouble();

    System.out.printf("%s's weight (e.g. 65.7): ", name);
    weight = scanner.nextFloat();

    System.out.printf("%s's age: %d", name, age);
    System.out.printf("%s's height: %.1f Cm", name, height);
    System.out.printf("%s's weight: %.1f Kg", name, weight);

    scanner.close();
}
