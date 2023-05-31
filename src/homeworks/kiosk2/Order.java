package homeworks.kiosk2;

import java.util.ArrayList;

public class Order {

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
}
