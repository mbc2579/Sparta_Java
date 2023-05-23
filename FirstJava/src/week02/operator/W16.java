package week02.operator;

import java.util.Scanner;

public class W16 {
    public static void main(String[] args) {
        // 입력받는 단을 제외하고 출력!!
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt();

        // 구구단 만들기
        for (int i = 2; i <= 9; i++)  {
            if(i == passNum) {
                continue;
            }
            for (int j= 1; j<=9; j++) {
                System.out.println(i + "X" + j + "는" + (i*j) + "입니다.");
            }
        }
    }
}
