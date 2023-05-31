package homeworks.kiosk2;

public class Ade extends Menu{
    private String name;
    private double Price;
    private String description;

    public static void ade() {
        System.out.println("NipongNaepong에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();

        System.out.println("[ ADE MENU ]");
        System.out.println("1. 청포도에이드(500ML)   | W 4.0  | 청포도에이드");
        System.out.println("2. 애플망고에이드(500ML) | W 4.0  | 애플망고에이드");
        System.out.println("3. 오렌지에이드(500ML)   | W 4.0  | 오렌지에이드");
        System.out.println("-----------------------------------------------------------------");
    }

    public static void greengrapes() {
        System.out.println("청포도에이드(500ML)   | W 4.0  | 청포도에이드");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
    }
    public static void applemango() {
        System.out.println("애플망고에이드(500ML) | W 4.0  | 애플망고에이드");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
    }
    public static void Orange() {
        System.out.println("오렌지에이드(500ML)   | W 4.0  | 오렌지에이드");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
    }
}
