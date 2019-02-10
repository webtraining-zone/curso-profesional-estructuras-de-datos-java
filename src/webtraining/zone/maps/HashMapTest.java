package webtraining.zone.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();

        // KEY (String) -> VALUE (Person)
        map.put("AIMA", new Person("Alex", "Arriaga"));
        map.put("ESRI", new Person("Esmeralda", "Rodríguez"));

        Person esmeralda = map.get("ESRI");
        System.out.println(esmeralda);
        System.out.println(map.get("NotValid"));
    }
}
