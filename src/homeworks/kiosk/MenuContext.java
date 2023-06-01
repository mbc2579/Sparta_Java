package homeworks.kiosk;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuContext {

    ArrayList<String> allList = new ArrayList<>();


    private Map<String, List<Menu1>> menus;

    private Map<String, List<Products1>> menuProducts;

    private List<Products1> cart;

    public MenuContext() {
        menus = new HashMap<>();
        menuProducts = new HashMap<>();
        cart = new ArrayList<>();

        List<Menu1> mainMenus = new ArrayList<>();
        Menu1 menu1 = new Menu1("PPONG ", "각종 소스를 이용해 만드는 파스타");
        Menu1 menu2 = new Menu1("PIZZA ", "고구마, 마늘 등 다양한 피자");
        Menu1 menu3 = new Menu1("ADE   ", "매장에서 직접 만드는 에이드");
        Menu1 menu4 = new Menu1("ETC   ", "각종 토핑추가 및 사이드 메뉴");

        mainMenus.add(menu1);
        mainMenus.add(menu2);
        mainMenus.add(menu3);
        mainMenus.add(menu4);
        menus.put("Main", mainMenus);

        List<Menu1> orderMenus = new ArrayList<>();
        Menu1 menu5 = new Menu1("Order ", "장바구니를 확인 후 주문합니다.");
        Menu1 menu6 = new Menu1("Cancel", "진행중인 주문을 취소합니다.");

        orderMenus.add(menu5);
        orderMenus.add(menu6);
        menus.put("Order", orderMenus);

        List<Products1> ppongMenus = new ArrayList<>();
        Products1 menu7 = new Products1("크뽕", 9.9,  "베스트 메뉴!! 크림소스를 사용한 크림파스타!!");
        Products1 menu8 = new Products1("로뽕", 10.9,"로제소스&모짜렐라 치즈로 풍미를 한번 더!!");
        Products1 menu9 = new Products1("차뽕", 8.5,"1, 2, 3단계의 매콤한 국물!! 원하는 단계를 선택해 내 취향에 맞게!!");

        ppongMenus.add(menu7);
        ppongMenus.add(menu8);
        ppongMenus.add(menu9);
        menuProducts.put("Ppong", ppongMenus);

        List<Products1> pizzaMenus = new ArrayList<>();
        Products1 menu10 = new Products1("니피자", 10.9,  "달콤고소한 고구마피자, 매콤한 짬뽕과 최고의 조합");
        Products1 menu11 = new Products1("내피자", 10.9,"감칠맛 나는 갈릭버터로 크림치즈 딥소스에 찍어 먹는 스테디셀러");
        Products1 menu12 = new Products1("페피자", 12.9,"트리플치즈의 풍미와 페퍼로니의 만남");

        pizzaMenus.add(menu10);
        pizzaMenus.add(menu11);
        pizzaMenus.add(menu12);
        menuProducts.put("Pizza", pizzaMenus);

        List<Products1> adeMenus = new ArrayList<>();
        Products1 menu13 = new Products1("청포도에이드(500ML)  ", 4.0,  "청포도에이드");
        Products1 menu14 = new Products1("애플망고에이드(500ML)", 4.0,"애플망고에이드");
        Products1 menu15 = new Products1("오렌지에이드(500ML)  ", 4.0,"오렌지에이드");

        adeMenus.add(menu13);
        adeMenus.add(menu14);
        adeMenus.add(menu15);
        menuProducts.put("Ade", adeMenus);

        List<Products1> etcMenus = new ArrayList<>();
        Products1 menu16 = new Products1("면사리", 1.0,"면사리 추가");
        Products1 menu17 = new Products1("공기밥", 1.0,"공기밥 추가");

        etcMenus.add(menu16);
        etcMenus.add(menu17);
        menuProducts.put("Etc", etcMenus);

    }

    public List<Menu1> getMenus(String key) {
        return menus.get(key);
    }
    public List<Products1> getMenuProducts(String key) {
        return menuProducts.get(key);
    }
}
