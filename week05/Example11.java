import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int database, computer, system, operating, communication;
    final int CUTLINE = 40;
    String result;

    System.out.println("필기시험 합격 판정 프로그램");
    System.out.print(" 데이터베이스 점수 : ");
    database = keyboard.nextInt();
    System.out.print(" 전자계산기구조 점수 : ");
    computer = keyboard.nextInt();
    System.out.print(" 시스템분석설계 점수 : ");
    system = keyboard.nextInt();
    System.out.print(" 운영체제 점수 : ");
    operating = keyboard.nextInt();
    System.out.print(" 정보통신개론 점수 : ");
    communication = keyboard.nextInt();

    boolean check1 = database < CUTLINE || computer < CUTLINE ||
         system < CUTLINE
          || operating < CUTLINE || communication < CUTLINE;
    int check2 = (database + computer + system +
                               operating + communication) / 5;

    result = check1 ? " 불 합격(과락)\n" :
          (check2 >= 60) ? "합격\n" : "불 합격(평균 점수 미달)\n";

    System.out.print(result);
}
