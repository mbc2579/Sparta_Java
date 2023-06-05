package homeworks.kiosk;

import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Menu1 menu1 = new Menu1("","");
        Cart cart = new Cart();
        Order order = new Order();
        MenuContext menuContext = new MenuContext();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double total = 0;


        while (true) {
            System.out.println("NipongNaepong에 오신걸 환영합니다.");
            System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
            System.out.println();
            System.out.println("[ NipongNaepong MENU ]");



//        System.out.print(menuContext.getMenus("Main").get(0).name);
//        System.out.println(menuContext.getMenus("Main").get(0).description);
//        System.out.print(menuContext.getMenus("Main").get(1).name);
//        System.out.println(menuContext.getMenus("Main").get(1).description);
//        System.out.print(menuContext.getMenus("Main").get(2).name);
//        System.out.println(menuContext.getMenus("Main").get(2).description);
//        System.out.print(menuContext.getMenus("Main").get(3).name);
//        System.out.println(menuContext.getMenus("Main").get(3).description);

            List<Menu1> mainMenus = menuContext.getMenus("Main");
            List<Menu1> orderMenus = menuContext.getMenus("Order");
            List<Products1> ppongMenus = menuContext.getMenuProducts("Ppong");
            List<Products1> pizzaMenus = menuContext.getMenuProducts("Pizza");
            List<Products1> adeMenus = menuContext.getMenuProducts("Ade");
            List<Products1> etcMenus = menuContext.getMenuProducts("Etc");

            int cnt = 0;
            for(Menu1 menu : mainMenus) {
                ++cnt;
                System.out.println(cnt + ". " + menu.name + " | " + menu.description);
            }

            System.out.println();
            System.out.println("[ ORDER MENU ]");

            for(Menu1 menu : orderMenus) {
                ++cnt;
                System.out.println(cnt + ". " + menu.name + " | " + menu.description);
            }

            System.out.println("--------------------------------------------------------");

            String menuss = sc.nextLine();

            // 메인메뉴에서 파스타를 선택
            if(menuss.equals("1")) {
                System.out.println("NipongNaepong에 오신걸 환영합니다.");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
                System.out.println();
                System.out.println("[ Ppong MENU ]");
                int cnt1 = 0;
                for(Products1 menu : ppongMenus) {
                    ++cnt1;
                    System.out.println(cnt1 + ". " + menu.name + " | " + menu.price + " | " + menu.description);
                }
                String menuss2 = sc.nextLine();
                // 파스타 메뉴에서 크뽕을 선택
                if(menuss2.equals("1")) {
                    order.product1();
                    // 장바구니에 추가
                    String menuss3 = sc.nextLine();
                    if(menuss3.equals("1")) {
                        order.allList.add("크뽕 | W 9.9  | 베스트 메뉴!! 크림소스를 사용한 크림파스타!!");
                        cart.cart1();
                        System.out.println();
                        total += 9.9;
                    } else if(menuss3.equals("2")) {
                        System.out.println();
                        menu1.mainmenu();
                    }
                } else if(menuss2.equals("2")) {
                    order.product2();
                    String menuss3 = sc.nextLine();
                    if(menuss3.equals("1")) {
                        order.allList.add("로뽕 | W 10.9  | 로제소스&모짜렐라 치즈로 풍미를 한번 더!!");
                        cart.cart2();
                        System.out.println();
                        total += 10.9;
                    } else if(menuss3.equals("2")) {
                        System.out.println();
                        menu1.mainmenu();
                    }
                } else if(menuss2.equals("3")) {
                    order.product3();
                    String menuss3 = sc.nextLine();
                    if(menuss3.equals("1")) {
                        order.allList.add("차뽕 | W 8.5  | 1, 2, 3단계의 매콤한 국물!! 원하는 단계를 선택해 내 취향에 맞게!!");
                        cart.cart3();
                        System.out.println();
                        total += 8.5;
                    } else if(menuss3.equals("2")) {
                        System.out.println();
                        menu1.mainmenu();
                    }
                }

            } else if(menuss.equals("2")) { // 메인메뉴에서 피자를 선택
                System.out.println("NipongNaepong에 오신걸 환영합니다.");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
                System.out.println();
                System.out.println("[ Pizza MENU ]");
                int cnt2 = 0;
                for(Products1 menu : pizzaMenus) {
                    ++cnt2;
                    System.out.println(cnt2 + ". " + menu.name + " | " + menu.price + " | " + menu.description);
                }
                String menuss2 = sc.nextLine();
                // 피자 메뉴에서 니피자을 선택
                if(menuss2.equals("1")) {
                    order.product4();
                    String menuss3 = sc.nextLine();
                    if(menuss3.equals("1")) {
                        order.allList.add("니피자 | W 10.9  | 달콤고소한 고구마피자, 매콤한 짬뽕과 최고의 조합");
                        cart.cart4();
                        System.out.println();
                        total += 10.9;
                    } else if(menuss3.equals("2")) {
                        System.out.println();
                        menu1.mainmenu();
                    }
                } else if(menuss2.equals("2")) {
                    order.product5();
                    String menuss3 = sc.nextLine();
                    if(menuss3.equals("1")) {
                        order.allList.add("내피자 | W 10.9  | 감칠맛 나는 갈릭버터로 크림치즈 딥소스에 찍어 먹는 스테디셀러");
                        cart.cart5();
                        System.out.println();
                        total += 10.9;
                    } else if(menuss3.equals("2")) {
                        System.out.println();
                        menu1.mainmenu();
                    }
                } else if(menuss2.equals("3")) {
                    order.product6();
                    String menuss3 = sc.nextLine();
                    if(menuss3.equals("1")) {
                        order.allList.add("페피자 | W 12.9  | 트리플치즈의 풍미와 페퍼로니의 만남");
                        cart.cart6();
                        System.out.println();
                        total += 12.9;
                    } else if(menuss3.equals("2")) {
                        System.out.println();
                        menu1.mainmenu();
                    }
                }
            } else if(menuss.equals("3")) { // 메인메뉴에서 에이드를 선택
                System.out.println("NipongNaepong에 오신걸 환영합니다.");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
                System.out.println();
                System.out.println("[ Ade MENU ]");
                int cnt3 = 0;
                for(Products1 menu : adeMenus) {
                    ++cnt3;
                    System.out.println(cnt3 + ". " + menu.name + " | " + menu.price + " | " + menu.description);
                }
                String menuss2 = sc.nextLine();
                // 에이드 메뉴에서 청포도에이드을 선택
                if(menuss2.equals("1")) {
                    order.product7();
                    String menuss3 = sc.nextLine();
                    if(menuss3.equals("1")) {
                        order.allList.add("청포도에이드(500ML) | W 4.0  | 청포도에이드");
                        cart.cart7();
                        System.out.println();
                        total += 4.0;
                    } else if(menuss3.equals("2")) {
                        System.out.println();
                        menu1.mainmenu();
                    }
                } else if(menuss2.equals("2")) {
                    order.product8();
                    String menuss3 = sc.nextLine();
                    if(menuss3.equals("1")) {
                        order.allList.add("애플망고에이드(500ML) | W 4.0  | 애플망고에이드");
                        cart.cart8();
                        System.out.println();
                        total += 4.0;
                    } else if(menuss3.equals("2")) {
                        System.out.println();
                        menu1.mainmenu();
                    }
                } else if(menuss2.equals("3")) {
                    order.product9();
                    String menuss3 = sc.nextLine();
                    if(menuss3.equals("1")) {
                        order.allList.add("오렌지에이드(500ML) | W 4.0  | 오렌지에이드");
                        cart.cart9();
                        System.out.println();
                        total += 4.0;
                    } else if(menuss3.equals("2")) {
                        System.out.println();
                        menu1.mainmenu();
                    }
                }
            } else if(menuss.equals("4")) { // 메인메뉴에서 사이드를 선택
                System.out.println("NipongNaepong에 오신걸 환영합니다.");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
                System.out.println();
                System.out.println("[ Etc MENU ]");
                int cnt4 = 0;
                for(Products1 menu : etcMenus) {
                    ++cnt4;
                    System.out.println(cnt4 + ". " + menu.name + " | " + menu.price + " | " + menu.description);
                }
                String menuss2 = sc.nextLine();
                // 에이드 메뉴에서 청포도에이드을 선택
                if(menuss2.equals("1")) {
                    order.product10();
                    String menuss3 = sc.nextLine();
                    if(menuss3.equals("1")) {
                        order.allList.add("면사리 | W 1.0  | 면사리 추가");
                        cart.cart10();
                        System.out.println();
                        total += 1.0;
                    } else if(menuss3.equals("2")) {
                        System.out.println();
                        menu1.mainmenu();
                    }
                } else if(menuss2.equals("2")) {
                    order.product11();
                    String menuss3 = sc.nextLine();
                    if(menuss3.equals("1")) {
                        order.allList.add("공기밥 | W 1.0  | 공기밥 추가");
                        cart.cart11();
                        System.out.println();
                        total += 1.0;
                    } else if(menuss3.equals("2")) {
                        System.out.println();
                        menu1.mainmenu();
                    }
                }
            } else if (menuss.equals("5")) {
                order.orderst1();
                order.fors();
                System.out.println();
                System.out.println("[ Total ]");
                System.out.printf("W %.1f\n", total);
                System.out.println();
                System.out.println("1. 주문     2. 메뉴판");
                String menuss2 = sc.nextLine();
                if(menuss2.equals("1")) {
                    System.out.println("주문이 완료되었습니다!");
                    count += 1;
                    System.out.println();
                    System.out.println("대기번호는 [ " + count + " ] 번 입니다.");
                    System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
                    order.allList.clear();
                    total = 0;
                    Thread thread = new Thread();
                    try {
                        thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    thread.interrupt();
                    System.out.println();
                }
            } else if(menuss.equals("6")) {
                order.orderst2();
                String menus2 = sc.nextLine();
                if (menus2.equals("1")) {
                    System.out.println("진행하던 주문이 취소되었습니다.");
                    System.out.println();
                    order.allList.clear();
                    total = 0;
                }
            }
        }
    }
}
