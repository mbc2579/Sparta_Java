package week03;

public class Car {

    // [우리가 클래스를 만들기 위해서는 4가지 STEP이 필요]
    // 1. 만들려고 하는 설계도를 선언한다. (클래스 선언)
    // 2. 객체가 가지고 있어야할 속성(필드)을 정의한다.
    // 3. 객체를 생성하는 방식을 정의한다. (생성자)
    // 4. 객체가 가지고 있어야할 행위(메서드)를 정의한다.

    // 필드 영역

    // 1) 고유 데이터 영억
    String company; // 자동차 회사
    String model = "Gv80"; // 자동차 모델
    String color; // 자동차 색
    double price; // 자동차 가격

    // 2) 상태 데이터 영억
    double speed; // 자동차 속도, km/h
    char gear; // 기어상태
    boolean lights = true; // 자동차 조명 상태

    // 객체 데이터 영억
    Tire tire = new Tire();
    Door door;
    Handle handle;


    // 생성자 : 처음 객체가 생성될 때 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의
    public Car() {
        // 기본생성자 : 생략 가능
    }

    // 메서드

    // gasPedal
    // input : kmh
    // output : speed
    double gasPedal(double kmh, char type) {
        changeGear(type); // 가속도 폐달을 밟으면 자동으로 기어가 변한다.
        speed = kmh;
        return speed;
    }

    // brakePedel
    // input : x
    // output : speed
    double brakePedal() {
        speed = 0;
        return speed;
    }

    // changeGear
    // input : gear(char type)
    // output : gear
    char changeGear (char type) {
        gear = type;
        return gear;
    }

    // onOffLight
    // input : x
    // output : lights(boolean)
    boolean onOffLights () {
        lights = !lights;
        return lights;
    }

    // horn
    // input : x
    // output : x
    void horn () {
        System.out.println("빵빵!");
    }

    // 자동차의 속도 .. 가변길이 메서드
    void carSpeeds(double ... speeds) {
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }
}
