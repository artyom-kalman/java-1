import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    long weight = 0L;
    int apple;
    int box;

    System.out.print("\n 하나의 사과 박스 무게 (Kg) : ");
    apple = keyboard.nextInt();
    System.out.print(" 사과 박스의 수 : ");
    box = keyboard.nextInt();
    weight = (long) apple * box;
    System.out.printf("\n %d Kg의 사과상자 %,d개의 무게는 %,dKg 입니다.\n", apple, box, weight);
}
