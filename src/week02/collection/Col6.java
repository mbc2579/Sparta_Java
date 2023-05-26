package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        // Map : key - value pair -> 중요
        // key라는 값으로 unique하게 보장이 돼야 함
        // Map -> HashMap, TreeMap으로 응용

        Map<String, Integer> intMap = new HashMap<>();

        // 키 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14); // 중복 key
        intMap.put("삼", 15); // 중복 key

        // key 값 전체 출력 (향상된 for몫)
        for (String key: intMap.keySet()) {
            System.out.println(key);
        }

        // value 값 전체 출력 (향상된 for몫)
        for (Integer values: intMap.values()) {
            System.out.println(values);
        }

        System.out.println(intMap.get("삼"));
    }
}
