import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    double celsius;
    double fahrenheit;

    System.out.print("섭씨 온도를 입력하세요 ");
    celsius = keyboard.nextDouble();

    fahrenheit = celsius * 9 / 5 + 32;

    System.out.printf("%.1f℃ = %.1f℉\n", celsius, fahrenheit);

    keyboard.close();
}
