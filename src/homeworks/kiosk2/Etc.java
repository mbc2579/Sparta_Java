package homeworks.kiosk2;


public class Etc extends Menu {
    private String name;
    private double Price;
    private String description;

    public static void etc() {
        System.out.println("NipongNaepong에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();

        System.out.println("[ ETC MENU ]");
        System.out.println("1. 면사리 | W 1.0 | 면사리 추가");
        System.out.println("2. 공기밥 | W 1.0 | 공기밥 추가");
        System.out.println("-----------------------------------------------------------------");
    }

    public static void ramensari() {
        System.out.println("면사리 | W 1.0 | 면사리 추가");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
    }
    public static void rice() {
        System.out.println("공기밥 | W 1.0 | 공기밥 추가");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
    }
}
