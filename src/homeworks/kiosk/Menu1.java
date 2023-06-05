package homeworks.kiosk;

public class Menu1{
    String name;
    String description;

    public Menu1(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void mainmenu() {
        System.out.println("NipongNaepong에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ NipongNaepong MENU ]");
        System.out.println("1. PPONG   | 각종 소스를 이용해 만드는 파스타");
        System.out.println("2. PIZZA   | 고구마, 마늘 등 다양한 피자");
        System.out.println("3. ADE     | 매장에서 직접 만드는 에이드");
        System.out.println("4. ETC     | 각종 토핑추가 및 사이드 메뉴");
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order   | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel  | 진행중인 주문을 취소합니다.");
        System.out.println("-----------------------------------------------------------------");
    }
}
