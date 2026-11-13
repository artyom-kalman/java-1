import java.util.Scanner;

public class Report1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("초기 높이 X(m)를 입력하세요: ");
        double height = scanner.nextDouble();

        double totalDistance = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("공의 %d번째 낙하 높이: %.4f m%n", i, height);

            if (i == 1) {
                totalDistance += height;
            } else {
                totalDistance += height * 2;
            }

            height = height * 2.0 / 3.0;
        }

        System.out.printf("총 이동 거리: %.4f m%n", totalDistance);
        scanner.close();
    }
}
