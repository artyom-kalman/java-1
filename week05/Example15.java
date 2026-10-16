import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int area;
    final int PAINT = 180;
    int can;

    System.out.print(" 페인트 칠할 면적 입력 : ");
    area = keyboard.nextInt();

    can = area / PAINT;
    can += ((area % PAINT) == 0) ? 0 : 1;

    System.out.printf("필요한 페인트 통 : %d 통\n", can);
}
