package week01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Variable {
    public static void main(String[] args) {

        // (1) boolean
        // 변수를 선언해보자 => 타입 이름 = 값;
        boolean flag = true;
        flag = false;

        System.out.println(flag);

        // (2) 문자형(char) ''는 문자형 ""는 문자열
        char alphabet = 'A';
        System.out.println(alphabet);

        // (3) 정수형(byte, short, int, long)

        byte byteNumber = 127;          // -128 ~ 127 (1byte) 1byte = 8bit -> bit = 0과 1을 표현
        short shortNumber = 32767;      // -32,768 ~ 32,767
        int intNumber = 2147483647;
        long longNumber = 2147483647L;

        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);

        // (4) 실수형
        // float(4byte), double(8byte)

        float floatNumber = 0.123F;
        double doubleNumber = 0.123123132;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        // (5) 참조형
        // (5-1) 문자열 변수
        String helloWorld = "Hello world!";

        System.out.println(helloWorld);

        // (5-2) 배열
        int[] a = {1, 2, 3};

        System.out.println(Arrays.toString(a));

        // (6) 래퍼 클래스(Wrapper class 변수)
        int number = 21;
        Integer num = number;
        System.out.println(num);
    }
}
