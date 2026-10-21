void main() {
    final long RADIUS = 6378137L;
    final double PI = 3.141592;
    final double AREA = 99720 * 10000;
    double surface;
    double korea;

    System.out.println(" 대한민국의 표면적을 구해보자");
    surface = 4 * PI * RADIUS * RADIUS;
    korea = (AREA / surface) * 100;

    System.out.printf(" 지구의 표면적 : %,.2f \u33A1\n", surface);
    System.out.printf(" 한국의 면적 : %,.2f \u33A1\n", AREA);
    System.out.printf(" 지구의 표면적중에 대한민국은 %.8f %%를\n              차지하고 있다.\n ", korea);
}
