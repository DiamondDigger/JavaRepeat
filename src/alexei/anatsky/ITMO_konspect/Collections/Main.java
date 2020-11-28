package alexei.anatsky.ITMO_konspect.Collections;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> cache = new SimpleLRUCache<>(2);

        cache.put(1, "1");
        cache.put(2, "2");
        cache.put(3, "3");

        cache.get(2);
        cache.put(9, "9");

        cache.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));

    }
}
