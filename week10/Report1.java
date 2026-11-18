import java.util.Scanner;

public class Report1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[7];

        System.out.println("홍길동 선수의 심판 점수를 입력하세요 (60.0 ~ 100.0)");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 심판 점수: ");
            double score = scanner.nextDouble();
            if (score < 60.0 || score > 100.0) {
                System.out.println("60.0 ~ 100.0 사이로 다시 입력하세요.");
                i--;
                continue;
            }
            scores[i] = score;
        }

        double max = scores[0];
        double min = scores[0];
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            sum += scores[i];
        }

        double finalScore = (sum - max - min) / (scores.length - 2);

        System.out.println("최고 점수: " + max);
        System.out.println("최저 점수: " + min);
        System.out.printf("홍길동 선수의 최종 점수: %.2f%n", finalScore);
        scanner.close();
    }
}
