// public : (접근)제어자, public(공공의, 공통의)
public class Main {

    // [JDK의 역할 3가지]
    // (1) compiler : .java -> .class
    // (2) JRE
    // (3) JDB : 디버깅


    // 자바 프로젝트는, 제일 먼저 클래스의 main 메소드를 실행시킨다.
    // = JVM의 약속
    // static : 이 프로그램이 시작될 때 무조건 실행되는 녀석임을 표현

    // void : 메서드의 출력값의 데이터 타입
    // void : "아무것도 없다." -> 출력은 없다. 한마디로 출력이 없는 메소드는 void를 사용
    // 출력이 있다고 하면 보통 메서드 안에 return ~~~~로 리턴해 출력함
    // (String[] args) = input = 매개변수 자리, void = output
    public static void main(String[] args) {

        // 객체 : 특징(속성, 변수), 행동(메소드)
        System.out.println("Our First Project! :) ");
    }
}