import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("키(cm) 입력 : ");
    int height = keyboard.nextInt();
    System.out.print("나이 입력 : ");
    int age = keyboard.nextInt();
    System.out.print("보호자 동반 여부 (true/false) : ");
    boolean guardian = keyboard.nextBoolean();

    boolean canRide = (height >= 120) && (age >= 10 || guardian);
    System.out.println(canRide ? "탑승 가능" : "탑승 불가");
}
