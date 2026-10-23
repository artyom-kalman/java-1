import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("당신의 JAVA 점수 입력 : ");
    int score = keyboard.nextInt();

    System.out.println("입력 점수 : " + score);

    if (score < 0 || score > 100) {
        System.out.println("잘못된 점수입니다.");
    } else if (score < 60) {
        System.out.println("학점 : F");
    } else {
        int tens = (score == 100) ? 9 : score / 10;   // 9, 8, 7, 6
        char letter = (char) ('A' + (9 - tens));      // ASCII: 'A'=65, 'B'=66 ...
        char sign = (score == 100 || score % 10 >= 5) ? '+' : '0';
        System.out.println("학점 : " + letter + sign);
    }

    keyboard.close();
}
