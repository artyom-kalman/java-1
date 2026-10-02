import java.math.BigInteger;

void main() {
    long a = 3000000000L;
    long b = 4000000000L;

    long c = a + b;

    System.out.printf("a = %,d\n", a);
    System.out.printf("b = %,d\n", b);
    System.out.printf("c = %,d\n", c);

    BigInteger a1 = BigInteger.valueOf(a);
    BigInteger b1 = BigInteger.valueOf(b);
    BigInteger c1 = BigInteger.valueOf(c);

    System.out.printf("a = %,d\n", a);
    System.out.printf("b = %,d\n", b);
    System.out.printf("c = %,d\n", c);
}
