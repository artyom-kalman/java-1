import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a, b, c;

        System.out.println("삼각형");
        System.out.print("첫 번째 변 a: ");
        a = keyboard.nextInt();
        System.out.print("두 번째 변 b: ");
        b = keyboard.nextInt();
        System.out.print("세 번째 변 c: ");
        c = keyboard.nextInt();

        boolean isTriangle = a + b > c && a + c > b && b + c > a;
        boolean isRight = a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;

        String type = (a == b && b == c) ? "정 삼각형"
            : (a == b || b == c || a == c) ? "이등변 삼각형"
            : "일반 삼각형";
        type = isRight ? type + " (직각 삼각형)" : type;

        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        if (isTriangle) {
            System.out.println("삼각형이 성립합니다.");
            System.out.println("삼각형의 종류: " + type);
            System.out.printf("삼각형의 면적: %.2f ㎠%n", area);
        } else {
            System.out.println("삼각형 아님");
        }
    }
}
