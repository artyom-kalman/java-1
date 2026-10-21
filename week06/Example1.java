void main() {
    final int HEART = 65;
    final int LIFE = 78;
    int minute;
    long count;

    minute = 365 * 24 * 60;
    count = HEART * LIFE * minute;

    System.out.printf("1년은 %,d 분이다.\n", minute);
    System.out.printf("나는 평생 %d 년을 산다.\n", LIFE);
    System.out.printf("심장은 1분에 %d번 작동합니다.\n", HEART);
    System.out.printf("나는 평생 %,d 번의 심장이 박동한다.\n", count);
}
