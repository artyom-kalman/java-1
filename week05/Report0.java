void main() {
    int i = 10, j = 5;
    int age = 11, b = 20, c = 6;
    char ch = 'k';
    int year = 2024;
    boolean powerOn = false;
    String str = "yes";

    System.out.println("1. i % j == 0                       : " + (i % j == 0));
    System.out.println("2. age <= 12                        : " + (age <= 12));
    System.out.println("3. age < b && age > c               : " + (age < b && age > c));
    System.out.println("4. age - 5 == 10                    : " + (age - 5 == 10));
    System.out.println("5. age != b || age == c             : " + (age != b || age == c));
    System.out.println("6. 'a' <= ch && ch <= 'z'           : " + ('a' <= ch && ch <= 'z'));
    System.out.println("7. ch가 영문자                       : "
            + (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')));
    System.out.println("8. year가 윤년                       : "
            + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)));
    System.out.println("9. !powerOn                         : " + (!powerOn));
    System.out.println("10. str.equals(\"yes\")              : " + str.equals("yes"));
}
