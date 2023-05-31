package homeworks.kiosk2;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menus = new Menu();
        Ppong ppongs = new Ppong();
        Pizza pizzas = new Pizza();
        Ade ades = new Ade();
        Etc etcs = new Etc();
        Order order = new Order();
        int count = 0;
        double total = 0;



        while (true) {

            menus.menus();

            // 메뉴선택
            Scanner sc = new Scanner(System.in);
            String menus1 = sc.nextLine();
            // 메인 메뉴에서 1번
            if (menus1.equals("1")) {
                ppongs.ppong();
                String menus2 = sc.nextLine();
                // 상품 메뉴에서 1번 즉 크뽕을 선택
                if(menus2.equals("1")) {
                    ppongs.kppong();
                    String menus3 = sc.nextLine();
                    // 장바구니에 넣을지 말지 선택
                    if(menus3.equals("1")) {
                        order.allList.add("크뽕 | W 9.9  | 베스트 메뉴!! 크림소스를 사용한 크림파스타!!");
                        System.out.println("크뽕이 장바구니에 추가되었습니다.");
                        System.out.println();
                        total += 9.9;
                    }
                } else if(menus2.equals("2")) {
                    ppongs.lppong();
                    String menus3 = sc.nextLine();
                    if(menus3.equals("1")) {
                        order.allList.add("로뽕 | W 10.9 | 로제소스&모짜렐라 치즈로 풍미를 한번 더!!");
                        System.out.println("로뽕이 장바구니에 추가되었습니다.");
                        System.out.println();
                        total += 10.9;
                    }
                } else if(menus2.equals("3")) {
                    ppongs.cppong();
                    String menus3 = sc.nextLine();
                    if(menus3.equals("1")) {
                        order.allList.add("차뽕 | W 8.5  | 1, 2, 3단계의 매콤한 국물!! 원하는 단계를 선택해 내 취향에 맞게!!");
                        System.out.println("차뽕이 장바구니에 추가되었습니다.");
                        System.out.println();
                        total += 8.5;
                    }
                }
            } else if (menus1.equals("2")) {
                pizzas.pizza();
                String menus2 = sc.nextLine();
                if(menus2.equals("1")) {
                    pizzas.youpizza();
                    String menus3 = sc.nextLine();
                    if(menus3.equals("1")) {
                        order.allList.add("니피자 | W 10.9  | 달콤고소한 고구마피자, 매콤한 짬뽕과 최고의 조합");
                        System.out.println("니피자가 장바구니에 추가되었습니다.");
                        System.out.println();
                        total += 10.9;
                    }
                } else if(menus2.equals("2")) {
                    pizzas.mypizza();
                    String menus3 = sc.nextLine();
                    if(menus3.equals("1")) {
                        order.allList.add("내피자 | W 10.9  | 감칠맛 나는 갈릭버터로 크림치즈 딥소스에 찍어 먹는 스테디셀러");
                        System.out.println("내피자가 장바구니에 추가되었습니다.");
                        System.out.println();
                        total += 10.9;
                    }
                } else if(menus2.equals("3")) {
                    pizzas.pepizza();
                    String menus3 = sc.nextLine();
                    if(menus3.equals("1")) {
                        order.allList.add("페피자 | W 12.9  | 트리플치즈의 풍미와 페퍼로니의 만남");
                        System.out.println("페피자가 장바구니에 추가되었습니다.");
                        System.out.println();
                        total += 12.9;
                    }
                }
            } else if (menus1.equals("3")) {
                ades.ade();
                String menus2 = sc.nextLine();
                if(menus2.equals("1")) {
                    ades.greengrapes();
                    String menus3 = sc.nextLine();
                    if(menus3.equals("1")) {
                        order.allList.add("청포도에이드(500ML) | W 4.0  | 청포도에이드");
                        System.out.println("청포도에이드(500ML)가 장바구니에 추가되었습니다.");
                        System.out.println();
                        total += 4.0;
                    }
                } else if(menus2.equals("2")) {
                    ades.applemango();
                    String menus3 = sc.nextLine();
                    if(menus3.equals("1")) {
                        order.allList.add("애플망고에이드(500ML) | W 4.0  | 애플망고에이드");
                        System.out.println("애플망고에이드(500ML)가 장바구니에 추가되었습니다.");
                        System.out.println();
                        total += 4.0;
                    }
                } else if(menus2.equals("3")) {
                    ades.Orange();
                    String menus3 = sc.nextLine();
                    if(menus3.equals("1")) {
                        order.allList.add("오렌지에이드(500ML) | W 4.0  | 오렌지에이드");
                        System.out.println("오렌지에이드(500ML)가 장바구니에 추가되었습니다.");
                        System.out.println();
                        total += 4.0;
                    }
                }
            } else if (menus1.equals("4")) {
                etcs.etc();
                String menus2 = sc.nextLine();
                if(menus2.equals("1")) {
                    etcs.ramensari();
                    String menus3 = sc.nextLine();
                    if(menus3.equals("1")) {
                        order.allList.add("면사리 | W 1.0  | 면사리 추가");
                        System.out.println("면사리가 장바구니에 추가되었습니다.");
                        System.out.println();
                        total += 1.0;
                    }
                } else if(menus2.equals("2")) {
                    etcs.rice();
                    String menus3 = sc.nextLine();
                    if(menus3.equals("1")) {
                        order.allList.add("공기밥 | W 1.0  | 공기밥 추가");
                        System.out.println("공기밥이 장바구니에 추가되었습니다.");
                        System.out.println();
                        total += 1.0;
                    }
                }
            } else if(menus1.equals("5")) {
                order.cart1();
                order.fors();
                System.out.println();
                System.out.println("[ Total ]");
                // 토탈
                System.out.printf("W %.1f\n", total);
                System.out.println();
                System.out.println("1. 주문        2. 메뉴판");
                String menus2 = sc.nextLine();
                if(menus2.equals("1")) {
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
            } else if(menus1.equals("6")) {
                order.cart2();
                String menus2 = sc.nextLine();
                if(menus2.equals("1")) {
                    System.out.println("진행하던 주문이 취소되었습니다.");
                    System.out.println();
                    order.allList.clear();
                    total = 0;
                }
            }
        }


    }
}
