import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("초 입력 : ");
    int total = keyboard.nextInt();

    int hour = total / 3600;
    int minute = (total % 3600) / 60;
    int second = total % 60;

    System.out.printf("%d시간 %d분 %d초\n", hour, minute, second);
}
