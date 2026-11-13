import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double time;
        int total, day, hour, minute, second;

        System.out.println("시간 변환");
        System.out.print("시간 입력: ");
        time = keyboard.nextDouble();

        total = (int) (time * 3600);

        day = total / 86400;
        hour = total % 86400 / 3600;
        minute = total % 3600 / 60;
        second = total % 60;

        System.out.printf("%.2f 시간은 %d일 %d시간 %d분 %d초 입니다%n", time, day, hour, minute, second);
    }
}
