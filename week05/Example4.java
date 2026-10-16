void main() {
    boolean a = true;
    boolean b = true;
    boolean c = false;

    System.out.printf("%b && %b is %b\n", a, b, a && b);
    System.out.printf("%b && %b is %b\n", a, c, a && c);
    System.out.printf("%b && %b is %b\n", c, a, c && a);
    System.out.printf("%b || %b is %b\n", a, c, a || c);
    System.out.printf("%b || %b is %b\n", c, a, c || a);
    System.out.printf("%b || %b is %b\n", c, c, c || c);
}
