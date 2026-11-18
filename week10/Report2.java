import java.util.Scanner;

public class Report2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        double[] weights = new double[10];
        double sum = 0;

        for (int i = 0; i < names.length; i++) {
            System.out.print((i + 1) + "번 학생 이름: ");
            names[i] = scanner.next();
            System.out.print(names[i] + " 몸무게(30.0 ~ 120.0kg): ");
            double weight = scanner.nextDouble();
            while (weight < 30.0 || weight > 120.0) {
                System.out.print("30.0 ~ 120.0 사이로 다시 입력하세요: ");
                weight = scanner.nextDouble();
            }
            weights[i] = Math.round(weight * 10) / 10.0;
            sum += weights[i];
        }

        double average = sum / weights.length;
        int count = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] >= average) {
                count++;
            }
        }

        for (int i = 0; i < weights.length - 1; i++) {
            for (int j = i + 1; j < weights.length; j++) {
                if (weights[i] < weights[j]) {
                    double tempWeight = weights[i];
                    weights[i] = weights[j];
                    weights[j] = tempWeight;
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        System.out.printf("%n평균 몸무게: %.1fkg%n", average);
        System.out.printf("평균 이상 학생 비율: %.1f%% (%d명)%n", count * 100.0 / weights.length, count);
        System.out.println("상위 2명: " + names[0] + "(" + weights[0] + "kg), " + names[1] + "(" + weights[1] + "kg)");
        System.out.println("하위 2명: " + names[9] + "(" + weights[9] + "kg), " + names[8] + "(" + weights[8] + "kg)");
        scanner.close();
    }
}
