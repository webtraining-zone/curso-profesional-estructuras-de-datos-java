package webtraining.zone.arrays;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    private static boolean isAnAppleInFruits(List<String> fruits) {
        for (String fruit : fruits) {

            if (fruit.equals("grape")) {
                return true;
            }
        }

//        String s = "anita lava la tina";
//        char[] chars = s.toCharArray();
//
//        for(char letter : chars ) {
//
//        }

        return false;
    }

    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();

        fruits.add("apple");
        fruits.add("watermelon");
        fruits.add("pear");
        fruits.add("pineapple");

        System.out.println(fruits);
        System.out.println(isAnAppleInFruits(fruits));

        // toString()
    }
}
