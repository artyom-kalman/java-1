import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int year;
    String result = "";

    System.out.print("Enter birth year: ");
    year = keyboard.nextInt();

    switch (year % 12) {
        case 0:
            result = "monkey";
            break;
        case 1:
            result = "rooster";
            break;
        case 2:
            result = "dog";
            break;
        case 3:
            result = "pig";
            break;
        case 4:
            result = "rat";
            break;
        case 5:
            result = "ox";
            break;
        case 6:
            result = "tiger";
            break;
        case 7:
            result = "rabbit";
            break;
        case 8:
            result = "dragon";
            break;
        case 9:
            result = "snake";
            break;
        case 10:
            result = "horse";
            break;
        case 11:
            result = "sheep";
    }

    System.out.println("You were born in " + year + " and your zodiac is " + result);
}
