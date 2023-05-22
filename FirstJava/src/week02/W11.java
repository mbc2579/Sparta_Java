package week02;

public class W11 {
    public static void main(String[] args) {
        // 중첩 if문
        boolean flag = true;
        int number = 2;

        if (flag) {
            if (number == 1) {
                System.out.println("flag가 true고, number값은 1입니다.");
            } else if (number == 2) {
                System.out.println("flag가 true고, number값은 2입니다.");
            } else {
                System.out.println("flag가 true고, number값은 모르겠습니다.");
            }
        } else {
            if (number == 1) {
                System.out.println("flag가 false고, number값은 1입니다.");
            } else if (number == 2) {
                System.out.println("flag가 false고, number값은 2입니다.");
            } else {
                System.out.println("flag가 false고, number값은 모르겠습니다.");
            }
        }
    }
}
