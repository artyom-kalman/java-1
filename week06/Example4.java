import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    final int LIFE = 7;     /* 담배 1대의 단축 생명 7분 */
    final int YEAR = 365;   /* 1년은 365일 */
    int life;               /* 담배 피운 기간 */
    int tobacco;            /* 1일 담배 소비량(개피) */
    int piece;              /* 소비한 담배 수량 */
    long minute;            /* 담배로 인한 수명단축(분) */
    int day;                /* 담배로 인한 수명단축(날) */

    System.out.print("담배를 몇년동안 피우셨나요 ? ");
    life = keyboard.nextInt();
    System.out.print("담배를 하루에 몇개피 피우시나요 ? ");
    tobacco = keyboard.nextInt();
    piece = life * YEAR * tobacco;
    minute = piece * LIFE;
    day = (int) (minute / (60 * 24));
    int year = day / YEAR;
    day -= (year * YEAR);
    minute -= ((year * YEAR + day) * 24 * 60);
    int hour = (int) (minute / 60);
    minute -= (hour * 60);
    System.out.printf("담배를 하루에 %d개피씩 ", tobacco);
    System.out.printf("%d년 동안 피우면 ", life);
    System.out.printf("수명단축은 %d년 %d일 %d 시간 %d분 입니다.\n",
            year, day, hour, minute);
}
