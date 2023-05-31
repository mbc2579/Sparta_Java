package homeworks.kiosk2;

import java.util.ArrayList;

public class Order {

    Thread thread = new Thread();

    ArrayList<String> allList = new ArrayList<>();

    public void fors() {
        for(String element: allList) {
            System.out.println(element);
        }
    }

    public static void cart1() {
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
        System.out.println("[ Orders ]");
    }

    // 주문 취소 메서드
    public void cart2() {
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
    }
    
}
