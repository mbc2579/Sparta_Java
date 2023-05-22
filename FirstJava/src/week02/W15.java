package week02;

public class W15 {
    public static void main(String[] args) {
        int number = 0;

        while (number < 3) {
            number++;
            System.out.println(number + "출력!");
        }

        // do ~ while
        int number2 = 4;
        do {
            // 이 로직을 먼저 수행하겠다!!
            System.out.println(number2 + " 출력!");
        } while (number2 < 3);

        // break(깨부수다)
        // 가장 가까운 블록의 for문 또는 while, switch문을 중단!
        int number3 = 0;
        while (number3 < 3) {
            number3++;
            if(number3 == 2) {
                break;
            }
            System.out.println(number3 + "출력!!");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            if (i == 2) {
                break;
            }
            for (int j = 0; j < 10; j++) {
                System.out.println("j: " + j);
                if(j == 2) {
                    break;
                }
            }
        }

        // continue
        int number4 = 0;
        while (number4 < 3) {
            number4++;
            if (number4 == 2) {
                continue;
            }
            System.out.println(number4 + "출력!");
        }
    }
}
