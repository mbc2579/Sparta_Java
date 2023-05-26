package week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        // 초기화

        // 1. 배열에 특정값 대입해서 선언
        int[] intArr = {1, 2, 3, 4, 5};
        String[] stringArray = {"a", "b", "c", "d"};

        // 2. for문을 통해서 대입
        for(int i=0; i<intArr.length; i++) {
            intArr[i] = i;
        }

        System.out.println("----------------------------");

        // 다건출력
        for(int i=0; i<intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        System.out.println("----------------------------");

        Arrays.fill(intArr, 1);

        for(int item: intArr) {
            System.out.println(item);
        }
    }
}
