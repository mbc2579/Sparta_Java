package homeworks.kiosk;

import java.util.ArrayList;

public class Order {
    Thread thread = new Thread();

    ArrayList<String> allList = new ArrayList<>();

    public void fors() {
        for(String element: allList) {
            System.out.println(element);
        }
    }

    public static void orderst1() {
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
        System.out.println("[ Orders ]");
    }

    // 주문 취소 메서드
    public void orderst2() {
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
    }

    public void product1() {
        System.out.println("크뽕 | W 9.9  | 베스트 메뉴!! 크림소스를 사용한 크림파스타!!");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");
    }
    public void product2() {
        System.out.println("로뽕 | W 10.9  | 로제소스&모짜렐라 치즈로 풍미를 한번 더!!");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");
    }
    public void product3() {
        System.out.println("차뽕 | W 8.5  | 1, 2, 3단계의 매콤한 국물!! 원하는 단계를 선택해 내 취향에 맞게!!");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");
    }
    public void product4() {
        System.out.println("니피자 | W 10.9  | 달콤고소한 고구마피자, 매콤한 짬뽕과 최고의 조합");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");
    }
    public void product5() {
        System.out.println("내피자 | W 10.9  | 감칠맛 나는 갈릭버터로 크림치즈 딥소스에 찍어 먹는 스테디셀러");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");
    }
    public void product6() {
        System.out.println("페피자 | W 12.9  | 트리플치즈의 풍미와 페퍼로니의 만남");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");
    }
    public void product7() {
        System.out.println("청포도에이드(500ML) | W 4.0  | 청포도에이드");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");
    }
    public void product8() {
        System.out.println("애플망고에이드(500ML) | W 4.0  | 애플망고에이드");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");
    }
    public void product9() {
        System.out.println("오렌지에이드(500ML) | W 4.0  | 오렌지에이드");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");
    }
    public void product10() {
        System.out.println("면사리 | W 1.0  | 면사리 추가");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");
    }
    public void product11() {
        System.out.println("공기밥 | W 1.0  | 공기밥 추가");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인    2. 취소");
    }
}
