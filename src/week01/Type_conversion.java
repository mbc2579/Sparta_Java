package week01;

public class Type_conversion {
    public static void main(String[] args) {
        // 형 변환 예제 : 변수의 타입을 바꾸는 방법
        // 문자열 -> 숫자
        // 정수 -> 실수 or 실수 -> 정수

        // double형 or float형을 int로
        // 실수 -> 정수 (0.xxxx -> 0)으로 변환
        double doubleNumber = 10.101010;
        float floatNumber = 10.1010f;

        // 변환(int)
        int intNumber;
        intNumber = (int)doubleNumber; // double -> int
        System.out.println("Double Type =>" + doubleNumber);
        System.out.println("Int Type =>" +intNumber);

        System.out.println("------------------------------------------------------------");

        int intNumber2;
        intNumber2 = (int)floatNumber;

        System.out.println("Float Type =>" + floatNumber);
        System.out.println("Int Type =>" +intNumber);

        System.out.println("------------------------------------------------------------");

        // 정수 -> 실수
        int intNumber3 = 10;

        double doubleNumber3 = (double)intNumber;
        float floatNumber3 = (float)intNumber;

        System.out.println("IntNumber3 => " + intNumber3);
        System.out.println("DoubleNumber3 => " + doubleNumber3);
        System.out.println("FloatNumber3 => " + floatNumber3);

        System.out.println("------------------------------------------------------------");

        // 자동형변환
        // 변수 타입별 크기 순서
        //  byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)

        // (1) byte -> int 자동형변환
        byte byteNumber = 10;
        int intNumber4 = byteNumber;
        System.out.println(intNumber4);

        System.out.println("------------------------------------------------------------");

        // (2) char(1 byte) -> int(4) 형변환
        char charAlphabet = 'A';
        intNumber = charAlphabet; // char -> int로 자동 형변환
        System.out.println(intNumber);

        System.out.println("------------------------------------------------------------");

        // (3) int -> long number 형변환
        intNumber = 100;
        long longNumber = intNumber;
        System.out.println(longNumber);

        System.out.println("------------------------------------------------------------");

        // (4) int -> double 형변환
        intNumber = 200;
        double doubleNumber1 = intNumber;
        System.out.println(doubleNumber1);

        System.out.println("------------------------------------------------------------");

        // 작은 크기의 타입이 큰 크기의 타입과 '계산'될 때,
        // 자동으로 큰 크기의 타입으로 형 변환이 된다.
        int intNumber5 = 10;
        double doubleNumber5 = 5.5;
        double result = intNumber5 + doubleNumber5;
        System.out.println("Plus => " + result);

        System.out.println("------------------------------------------------------------");

        // 1) 정수로 나누기
        int iResult = intNumber5 / 4;
        // 2) 실수로 나누기
        double dResult = intNumber5 / 4.0;

        System.out.println(iResult + " / " + dResult);
    }
}
