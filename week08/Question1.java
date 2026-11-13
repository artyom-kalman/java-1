public class Question1 {
    public static void main(String[] args) {
        int attend = 85;
        int report = 75;
        boolean cheating = false;
        int age = 30;
        int salary = 6000;
        boolean debt = true;
        int license = 2;
        boolean drunk = false;
        int score = 85;

        // 1
        boolean result1 = attend >= 80 && report >= 70 && !cheating;
        System.out.println("1 : " + result1);

        // 2
        boolean result2 = age >= 25 && age < 40 && salary >= 5000 && debt;
        System.out.println("2 : " + result2);

        // 3
        boolean result3 = age >= 21 && license >= 1 && !drunk;
        System.out.println("3 : " + result3);

        // 4
        boolean result4 = (score >= 80 && score < 90) || score == 100;
        System.out.println("4 : " + result4);

        // 5
        String result5 = (age >= 18 && score >= 80) ? "합격"
            : (age < 18 || score < 50) ? "불합격"
            : "재시험";
        System.out.println("5 : " + result5);
    }
}
