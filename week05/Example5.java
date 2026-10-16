void main() {
    int a = 0, b = 0;
    boolean x;

    x = false && ((a = b = 356) != 0);
    System.out.printf("x = %b, a = %d, b = %d\n", x, a, b);
    x = true || ((a = ++b) != 0);
    System.out.printf("x = %b, a = %d, b= %d\n", x, a, b);
    x = true && ((a = b = 356) != 0);
    System.out.printf("x = %b, a = %d, b = %d\n", x, a, b);
    x = false || ((a = ++b) != 0);
    System.out.printf("x = %b, a = %d, b = %d\n", x, a, b);
}
