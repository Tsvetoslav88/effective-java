package chapter5.item32;

import java.util.List;
import java.util.Objects;

// It is unsafe to store a value in a generic varargs array parameter (Page 146)
public class Dangerous {

    // Mixing generics and varargs can violate type safety!
    static void dangerous(List<String>... stringLists) {
        List<Integer> integerList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = integerList;// Heap pollution
        String s = stringLists[0].get(0);// ClassCastException
    }

    public static void main(String[] args) {
        dangerous(List.of("There be dragons!"));
    }
}
