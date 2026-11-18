import java.util.Scanner;

public class Report3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 (예: 660510-1321611): ");
        String input = scanner.next().replace("-", "");

        if (input.length() != 13) {
            System.out.println("주민등록번호는 13자리여야 합니다.");
            return;
        }

        int[] digits = new int[13];
        for (int i = 0; i < 13; i++) {
            char c = input.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("숫자만 입력하세요.");
                return;
            }
            digits[i] = c - '0';
        }

        int[] weights = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += digits[i] * weights[i];
        }
        int check = 11 - sum % 11;
        if (check >= 10) {
            check -= 10;
        }

        int gender = digits[6];
        String[] genderInfo = {"1800년대 여자", "1900년대 남자", "1900년대 여자", "2000년대 남자", "2000년대 여자",
                "1900년대 외국인 남자", "1900년대 외국인 여자", "2000년대 외국인 남자", "2000년대 외국인 여자", "1800년대 남자"};
        int[] centuries = {1800, 1900, 1900, 2000, 2000, 1900, 1900, 2000, 2000, 1800};

        int year = centuries[gender] + digits[0] * 10 + digits[1];
        int month = digits[2] * 10 + digits[3];
        int day = digits[4] * 10 + digits[5];
        int region = digits[7] * 10 + digits[8];

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            daysInMonth[1] = 29;
        }

        System.out.println("생년월일: " + year + "년 " + month + "월 " + day + "일");
        System.out.println("성별: " + genderInfo[gender]);
        System.out.println("출생지역: " + regionName(region));
        System.out.println("계산한 검증번호: " + check + ", 입력한 검증번호: " + digits[12]);

        if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("결과: 잘못된 주민등록번호입니다. (생년월일 오류)");
        } else if (regionName(region).equals("없음")) {
            System.out.println("결과: 잘못된 주민등록번호입니다. (지역번호 오류)");
        } else if (check != digits[12]) {
            System.out.println("결과: 잘못된 주민등록번호입니다. (검증번호 오류)");
        } else {
            System.out.println("결과: 올바른 주민등록번호입니다.");
        }
        scanner.close();
    }

    static String regionName(int code) {
        if (code <= 8) return "서울특별시";
        if (code <= 12) return "부산광역시";
        if (code <= 15) return "인천광역시";
        if (code <= 25) return "경기도";
        if (code <= 34) return "강원도";
        if (code <= 39) return "충청북도";
        if (code == 40) return "대전광역시";
        if (code == 44 || code == 96) return "세종특별자치시";
        if (code <= 47) return "충청남도";
        if (code <= 54) return "전라북도";
        if (code <= 64) return "전라남도";
        if (code <= 66) return "광주광역시";
        if (code <= 70) return "대구광역시";
        if (code <= 80) return "경상북도";
        if (code == 85) return "울산광역시";
        if (code <= 90) return "경상남도";
        if (code <= 95) return "제주특별자치도";
        return "없음";
    }
}
