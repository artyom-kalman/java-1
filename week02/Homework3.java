import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int familyMembers;
        String placeOfLiving;

        System.out.print("You name: ");
        name = keyboard.nextLine();

        System.out.print("You family members: ");
        familyMembers = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Your family lives in: ");
        placeOfLiving = keyboard.nextLine();

        System.out.printf("%s's family has %d members\n", name, familyMembers);
        System.out.printf("%s's family lives in %s", name, placeOfLiving);

        keyboard.close();
    }
}
