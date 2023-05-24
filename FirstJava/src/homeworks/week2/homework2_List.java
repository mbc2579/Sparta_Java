package homeworks.week2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class homework2_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strList = new ArrayList<String>();

        String DataStructureName = sc.nextLine();
        String name = sc.nextLine();
        while (true) {
            String recipe = sc.nextLine();
            if (recipe.equals("끝")) {
                break;
            }
            strList.add(recipe);
        }

        System.out.println("[" + DataStructureName + "로 저장된 " + name + "]");

        Iterator iterator = strList.iterator();

        for(int i = 0; i < strList.size(); i++) {
            int count = i + 1;
            System.out.println(count + ". " + iterator.next());
        }
    }
}
