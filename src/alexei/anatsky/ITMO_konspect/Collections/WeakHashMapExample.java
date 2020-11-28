package alexei.anatsky.ITMO_konspect.Collections;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        Map<Object, Integer > weakMap = new WeakHashMap<>();

        String data = "data";
        String info = "info";

        weakMap.put(data, 1);
        weakMap.put(info, 2);

        weakMap.values().forEach(value -> System.out.println("value: " + value));
        weakMap.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));

        info = null;
        data = null;

        System.gc();

        for (int i = 0; i < 10_000; i++) {
            if (weakMap.isEmpty()) {
                System.out.println("WeakMap is empty!");
            } else {
                System.out.println("# " + i + " No. It's not empty yet!");
            }
        }
    }
}
