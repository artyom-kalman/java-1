import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    int width;
    int length;
    int height;
    int vol;

    System.out.print("직육면체 가로 세로 높이 입력 : ");
    width = keyboard.nextInt();
    length = keyboard.nextInt();
    height = keyboard.nextInt();

    vol = width * length * height;

    System.out.printf("직육면체 가로 : %4d㎝\n", width);
    System.out.printf("직육면체 세로 : %4d㎝\n", length);
    System.out.printf("직육면체 높이 : %4d㎝\n", height);
    System.out.printf("직육면체 부피 : %4d㎤\n", vol);

    keyboard.close();
}
