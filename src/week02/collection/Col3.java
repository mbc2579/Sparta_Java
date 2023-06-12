package week02.collection;

import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        // Stack
        // 수직으로 값을 쌓아놓고, 넣었다가 뺀다. FILO (Basket)
        // push, peek, pop
        // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용
        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        // 다 지워질 때 까지 출력
        while (!intStack.isEmpty()) { // isEmpty 스택안에 데이터들이 비어있는지를 확인 비어있으면 true로 빠져나옴
            System.out.println(intStack.pop());
        }

        // 다시 추가
        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        // peak
        System.out.println(intStack.peek());
        System.out.println(intStack.size());
    }
}
