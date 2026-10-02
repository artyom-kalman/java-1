void main() {
    double a = 1500.35;
    double b = 89.76;

    int sum = (int) (a+b);
    double tax = sum * (10.0 / 100);
    double result = sum - tax;

    System.out.printf("A = %d\n", a);
    System.out.printf("B = %d\n", b);
    System.out.printf("Sum = %d\n", sum);
    System.out.printf("Tax = %d\n", (int)tax);
    System.out.printf("Result = %f\n", result);
}
