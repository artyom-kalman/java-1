import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("점수를 입력하세요 : ");
    int score = keyboard.nextInt();

    String result = (score >= 90) ? "A" :
          (score >= 80) ? "B" :
          (score >= 70) ? "C" :
          (score >= 60) ? "D" : "F";

    System.out.println("등급 : " + result);
}
