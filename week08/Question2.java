import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age, fee;

        System.out.println("체육관 입장료");
        System.out.print("나이: ");
        age = keyboard.nextInt();

        fee = (age >= 18) ? 4000
            : (age >= 13) ? 3000
            : (age >= 7) ? 1000
            : 0;

        System.out.printf("입장료 : %d원%n", fee);
    }
}
