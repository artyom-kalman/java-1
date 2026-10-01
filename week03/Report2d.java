import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);

    String school;
    String name;
    int age;
    char gender;
    float height;
    float weight;

    System.out.print("학교 : ");
    school = keyboard.nextLine();

    System.out.print("이름 : ");
    name = keyboard.nextLine();

    System.out.print("나이 : ");
    age = keyboard.nextInt();

    System.out.print("성별 : ");
    gender = keyboard.next().charAt(0);

    System.out.print("신장 : ");
    height = keyboard.nextFloat();

    System.out.print("체중 : ");
    weight = keyboard.nextFloat();

    System.out.println("*********************");
    System.out.printf("  학교 : %s\n", school);
    System.out.printf("  이름 : %s\n", name);
    System.out.printf("  나이 : %d\n", age);
    System.out.printf("  성별 : %c\n", gender);
    System.out.printf("  신장 : %.1f Cm\n", height);
    System.out.printf("  체중 : %.1f Kg\n", weight);
    System.out.println("*********************");

    keyboard.close();
}
