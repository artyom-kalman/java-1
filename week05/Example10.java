import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int year;
    String result;

    System.out.printf("년도를 입력 : ");
    year = keyboard.nextInt();

    int check1 = year % 4;
    int check2 = year % 100;
    int check3 = year % 400;
    result = ((check1 == 0) && (check2 != 0)) || (check3 == 0) ?
          "윤년" : "평년";

    System.out.printf("%d 년은 %s 입니다.\n", year, result);
}
