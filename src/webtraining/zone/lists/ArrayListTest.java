package webtraining.zone.lists;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Default size: 10
        // TODO: Don;t use this kind of creation because it is INSECURE, use "generics" instead
        List numbers = new ArrayList();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        // new Array() -> 20
        numbers.add(13434);

        // Foreach
//        for(Object number : numbers) {
//            System.out.print(number + " ");
//        }

        //
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
