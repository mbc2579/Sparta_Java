package week02;

public class W10 {
    public static void main(String[] args) {
        boolean flag = true;

        if (flag) {
            // true인 경우
            System.out.println("값이 true입니다.");
        }
        else {
            // false인 경우
            System.out.println("값이 false입니다.");
        }

        System.out.println("-----------------------------------------");

        // 조건문
        int number = 2;

        if (number == 1) {
            System.out.println("number값을 1입니다.");
        } else if (number == 2) {
            System.out.println("number값은 2입니다.");
        } else {
            System.out.println("number값은 모르는 값입니다.");
        }
    }
}
