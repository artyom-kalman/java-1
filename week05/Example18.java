import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    boolean capital;
    int person, rich;

    System.out.print("수도 입니까 ? (수도 : 1, 수도 아님 0)");
    capital = keyboard.nextInt() == 1;
    System.out.print("인구 (단위 : 만) ");
    person = keyboard.nextInt();
    System.out.print("부자의 수(단위 : 만) ");
    rich = keyboard.nextInt();

    boolean metro = (capital && person >= 100) || rich >= 50;
    System.out.print(metro);
}
