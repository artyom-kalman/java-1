import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("JAVA 점수를 입력하세요 : ");
    int score = keyboard.nextInt();

    String result = (score >= 60) ? "합격" : "불합격";
    System.out.println("결과 : " + result);
    keyboard.close();
}
