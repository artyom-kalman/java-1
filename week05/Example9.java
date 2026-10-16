import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    final int WON500 = 500;
    final int WON100 = 100;
    final int WON50 = 50;
    int money;
    int coin500, coin100, coin50;
    String result;

    System.out.print("거스름 돈 입력 : ");
    money = keyboard.nextInt();

    coin50 = money;
    coin500 = coin50 / WON500;
    coin50 %= WON500;
    coin100 = coin50 / WON100;
    coin50 %= WON100;
    coin50 = coin50 / WON50;

    System.out.printf("\n 거스름 돈 : %,d 원", money);
    result = (money % WON50 == 0) ?
          String.format("\n %d원 동전 : %,3d 개 (%,10d 원)",
                           WON500, coin500, coin500 * WON500) +
          String.format("\n %d원 동전 : %,3d 개 (%,10d 원)",
                                WON100, coin100, coin100 * WON100) +
          String.format("\n %d원 동전 : %,3d 개 (%,10d 원)",
                                  WON50, coin50, coin50 * WON50) :
          String.format("\n거스름 돈을 지불할 수 없음");
    System.out.println(result);
}
