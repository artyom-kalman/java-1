import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;

        System.out.println("You name");
        name = keyboard.nextLine();

        System.out.println("You age");
        age = keyboard.nextInt();

        System.out.printf("Name: %s, Age: %d", name, age);

        keyboard.close();
    }
}
