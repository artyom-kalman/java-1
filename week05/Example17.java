import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    String id, pw;
    int age;
    boolean isAdmin;
    boolean loginSuccess;
    String result;

    System.out.print("ID 입력 : ");
    id = keyboard.next();
    System.out.print("비밀번호 입력: ");
    pw = keyboard.next();
    System.out.print("나이 입력: ");
    age = keyboard.nextInt();
    System.out.print("관리자입니까? (true/false): ");
    isAdmin = keyboard.nextBoolean();

    loginSuccess = (id.equals("admin") ||
                      id.equals("user")) && pw.equals("1234");
    result = loginSuccess ?
          (age >= 18 ? (isAdmin ? "관리자 접근 허용" : "일반 접근 허용") :
                                   "접근 불가")
          : "로그인 실패";

    System.out.printf("입력된 ID : %s\n", id);
    System.out.printf("입력된 비밀번호 : %s\n", pw);
    System.out.printf("입력된 나이 : %d 세\n", age);
    System.out.printf("로그인 성공 여부 : %s\n", loginSuccess);
    System.out.println("결과 : " + result);
}
