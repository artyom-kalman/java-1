void main() {
    int left = 7, right = 7;
    left = (left++ < 7 && ++right < 7) ? 10 : left;
    System.out.println("left의 값 : " + left + " right의 값 : " + right);

    left = 7;
    right = 7;
    left = ((left++ < 7) & (++right < 7)) ? 10 : left;
    System.out.println("left의 값 : " + left + " right의 값 : " + right);

    left = 7;
    right = 7;
    left = ((left++ < 7) || (++right < 7)) ? 10 : left;
    System.out.println("left의 값 : " + left + " right의 값 : " + right);

    left = 7;
    right = 7;
    left = ((++left > 7) && (right++ < 7)) ? 10 : left;
    System.out.println("left의 값 : " + left + " right의 값 : " + right);

    left = 7;
    right = 7;
    left = ((++left > 7) && (--right < 7)) ? 10 : left;
    System.out.println("left의 값 : " + left + " right의 값 : " + right);

    left = 7;
    right = 7;
    left = ((--left < 7) || (right-- < 7)) ? 10 : left;
    System.out.println("left의 값 : " + left + " right의 값 : " + right);
}
