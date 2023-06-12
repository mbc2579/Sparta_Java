package week01;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int asciiNumber1 = sc.nextInt();
        char ch = (char) asciiNumber1; // 문자로 '형변환'을 해주면 숫자에 맞는 문자로 표현된다.

        System.out.println(ch);

        System.out.println("-------------------------------------------------");

        Scanner sc1 = new Scanner(System.in);

        char letter = sc1.nextLine().charAt(0); // 첫번째 글자만 받아오기 위해 charAt(0) 메서드를 사용
        int asciiNumber2 = (int)letter; // 숫자로 형변환을 해주면 저장되어있던 아스키 숫자값으로 표현됨.

        System.out.println(asciiNumber2);
    }
}
