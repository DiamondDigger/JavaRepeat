package alexei.anatsky.ITMO_konspect.Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>(new Comparator<String>() {
            public int compare(String str1, String str2) {
                if (str1.equals(str2)) {
                    return 0;
                } else if (str1.length() == str2.length()) {
                    int i1 = Integer.parseInt(str1);
                    int i2 = Integer.parseInt(str2);
                    if (i1 - i2 > 0) {
                        return -1;
                    } else if (i1 - i2 < 0) {
                        return 1;
                    }
                } else if (str1.length() > str2.length()) {
                    return 1;
                } else {
                    return -1;
                }
                return 10;
            }
        });
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
