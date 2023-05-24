package homeworks.week2;

import java.util.*;

public class homework2_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> set = new LinkedHashSet<>();

        System.out.println("요리 이름을 입력하세요.");
        String title = sc.nextLine().trim();
        System.out.println("=======================");
        System.out.println("레시피를 입력하세요.");

        while (true) {
            String text = sc.nextLine();
            if (text.equals("끝")) {
                break;
            }
            set.add(text);
        }
        System.out.println("=======================");
        Iterator iterator = set.iterator();
        System.out.println(title);
        for (int i=0; i<set.size(); i++) {
            if (iterator.hasNext()) {
                int count = i + 1;
                System.out.println(count + ". " + iterator.next());
            }
        }
    }
}
