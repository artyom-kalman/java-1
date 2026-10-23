import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int score;
    String result;

    System.out.print("Enter score: ");
    score = keyboard.nextInt();

    /***** Program 1 ****/
    if (score >= 90) {
        result = "Got an A";
    } else {
        result = "Did not get an A";
    }
    result += "\nThank you";

    if (!(score >= 0 && score <= 100))
        result = "ERROR : score must be between 0 and 100";
    System.out.println(result);

    /***** Program 2 ****/
    if (score >= 0 && score <= 100) {
        if (score >= 90) {
            result = "Got an A";
        } else {
            result = "Did not get an A";
        }
        result += "\nThank you";
    } else
        result = "ERROR : score must be between 0 and 100";

    System.out.println(result);

    /***** Program 3 ****/
    if (score >= 0 && score <= 100) {
        switch (score / 90) {
            case 0:
                result = "Did not get an A";
                break;
            case 1:
                result = "Got an A";
        }
        result += "\nThank you";
    } else
        result = "ERROR : score must be between 0 and 100";

    System.out.println(result);
}
