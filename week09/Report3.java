public class Report3 {
    public static void main(String[] args) {
        int wellDepth = 300;
        int climb = 55;
        int slip = 13;
        int height = 0;
        int day = 0;
        boolean escaped = false;

        while (day < 7) {
            day++;
            height += climb;
            if (height >= wellDepth) {
                escaped = true;
                System.out.println(day + "일째 낮에 탈출 성공 (현재 높이: " + height + "cm)");
                break;
            }
            height -= slip;
        }

        if (escaped) {
            System.out.println("결과: 일주일 안에 우물을 탈출할 수 있습니다.");
        } else {
            System.out.println("결과: 일주일 안에 우물을 탈출할 수 없습니다.");
        }
    }
}
