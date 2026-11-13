public class Report2 {
    public static void main(String[] args) {
        int totalAnimals = 37;
        int totalLegs = 102;

        // for문
        for (int chicken = 0; chicken <= totalAnimals; chicken++) {
            int dog = totalAnimals - chicken;
            if (chicken * 2 + dog * 4 == totalLegs) {
                System.out.println("for문 -> 닭: " + chicken + "마리, 개: " + dog + "마리");
            }
        }

        // while문
        int chicken = 0;
        while (chicken <= totalAnimals) {
            int dog = totalAnimals - chicken;
            if (chicken * 2 + dog * 4 == totalLegs) {
                System.out.println("while문 -> 닭: " + chicken + "마리, 개: " + dog + "마리");
            }
            chicken++;
        }

        // do-while문
        chicken = 0;
        do {
            int dog = totalAnimals - chicken;
            if (chicken * 2 + dog * 4 == totalLegs) {
                System.out.println("do-while문 -> 닭: " + chicken + "마리, 개: " + dog + "마리");
            }
            chicken++;
        } while (chicken <= totalAnimals);
    }
}
