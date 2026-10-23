import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int man1, man2;
    String man1result, man2result;
    String result;

    System.out.print("Player 1 (scissors = 1, rock = 2, paper = 3): ");
    man1 = keyboard.nextInt();
    System.out.print("Player 2 (scissors = 1, rock = 2, paper = 3): ");
    man2 = keyboard.nextInt();

    if (man1 >= 1 && man1 <= 3) {
        if (man1 == 1)
            man1result = "scissors";
        else if (man1 == 2)
            man1result = "rock";
        else
            man1result = "paper";
    } else {
        man1result = "";
    }

    if (man2 >= 1 && man2 <= 3) {
        if (man2 == 1)
            man2result = "scissors";
        else if (man2 == 2)
            man2result = "rock";
        else
            man2result = "paper";
    } else {
        man2result = "";
    }

    if (!(man1result.equals("") || man2result.isEmpty())) {
        switch (man1 - man2) {
            case 0:
                result = String.format("man1(%s) and man2(%s) tied.", man1result, man2result);
                break;
            case -1:
            case 2:
                result = String.format("man1(%s) and man2(%s): man2 wins.", man1result, man2result);
                break;
            case 1:
            case -2:
                result = String.format("man1(%s) and man2(%s): man1 wins.", man1result, man2result);
                break;
            default:
                result = "ERROR2 ";
        }
    } else {
        result = "ERROR1 ";
    }

    System.out.println(result);
}
