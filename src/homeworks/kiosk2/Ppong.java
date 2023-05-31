package homeworks.kiosk2;



public class Ppong extends Menu{
    private String name;
    private double price;
    private String description;

    public static void ppong() {
        System.out.println("NipongNaepong에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();

        System.out.println("[ PPONG MENU ]");
        System.out.println("1. 크뽕 | W 9.9  | 베스트 메뉴!! 크림소스를 사용한 크림파스타!!");
        System.out.println("2. 로뽕 | W 10.9 | 로제소스&모짜렐라 치즈로 풍미를 한번 더!!");
        System.out.println("3. 차뽕 | W 8.5  | 1, 2, 3단계의 매콤한 국물!! 원하는 단계를 선택해 내 취향에 맞게!!");
        System.out.println("-----------------------------------------------------------------");
    }

    public static void kppong() {
        System.out.println("크뽕 | W 9.9  | 베스트 메뉴!! 크림소스를 사용한 크림파스타!!");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
    }
    public static void lppong() {
        System.out.println("로뽕 | W 10.9 | 로제소스&모짜렐라 치즈로 풍미를 한번 더!!");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
    }
    public static void cppong() {
        System.out.println("차뽕 | W 8.5  | 1, 2, 3단계의 매콤한 국물!! 원하는 단계를 선택해 내 취향에 맞게!!");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
    }
}
