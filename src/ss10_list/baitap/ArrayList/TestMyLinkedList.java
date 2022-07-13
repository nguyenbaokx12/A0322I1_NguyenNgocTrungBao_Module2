package ss10_list.baitap.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class TestMyLinkedList {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Hello");
        a.add(1, "Bao1");
        a.add(2, "Bao2");
        a.add(3, "Bao3");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
