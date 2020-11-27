package alexei.anatsky.ITMO_konspect.Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("ab");
        strings.add("ac");
        strings.add("abc");
        strings.add("acb");
        strings.add("abcdef");

        Iterator<String> iterator = strings.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            System.out.println("elem #" + i + ": " + iterator.next());
            i++;
        }



    }
}
