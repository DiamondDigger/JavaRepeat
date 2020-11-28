package alexei.anatsky.ITMO_konspect.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleLRUCache<Integer, String> extends LinkedHashMap<Integer, String> {
    private final int capacity;

    public SimpleLRUCache(int capacity) {
        super(capacity + 1, 1.1f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        System.out.println("this.size(): " + this.size());
        return this.size() > capacity;
    }

}
