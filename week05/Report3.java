void main() {
    int total = 54321;

    int hours = total / 3600;
    int rest = total % 3600;
    int minutes = rest / 60;
    int seconds = rest % 60;

    System.out.println(total + "초 = " + hours + "시간 " + minutes + "분 " + seconds + "초");
}
