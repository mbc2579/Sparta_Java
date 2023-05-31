package homeworks.kiosk2;

public class Pizza extends Menu{
    private String name;
    private double Price;
    private String description;

    public static void pizza() {
        System.out.println("NipongNaepong에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();

        System.out.println("[ PIZZA MENU ]");
        System.out.println("1. 니피자 | W 10.9  | 달콤고소한 고구마피자, 매콤한 짬뽕과 최고의 조합");
        System.out.println("2. 내피자 | W 10.9  | 감칠맛 나는 갈릭버터로 크림치즈 딥소스에 찍어 먹는 스테디셀러");
        System.out.println("3. 페피자 | W 12.9  | 트리플치즈의 풍미와 페퍼로니의 만남");
        System.out.println("-----------------------------------------------------------------");
    }

    public static void youpizza() {
        System.out.println("니피자 | W 10.9  | 달콤고소한 고구마피자, 매콤한 짬뽕과 최고의 조합");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
    }
    public static void mypizza() {
        System.out.println("내피자 | W 10.9  | 감칠맛 나는 갈릭버터로 크림치즈 딥소스에 찍어 먹는 스테디셀러");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
    }
    public static void pepizza() {
        System.out.println("페피자 | W 12.9  | 트리플치즈의 풍미와 페퍼로니의 만남");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
    }
}
