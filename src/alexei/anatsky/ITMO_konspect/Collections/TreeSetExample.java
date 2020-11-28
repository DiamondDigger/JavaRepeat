package alexei.anatsky.ITMO_konspect.Collections;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        NavigableSet<String> strings = new TreeSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("ab");
        strings.add("ac");
        strings.add("abc");
        strings.add("acb");
        strings.add("abcdef");

        System.out.println("tailSet from 'abc': " + strings.tailSet("abc"));
        System.out.println("headSet from 'abc': " + strings.headSet("abc"));

        Set<String> descendingSet = strings.descendingSet();
        System.out.println("descending set: " + strings.descendingSet());

        Iterator<String> iterator = strings.iterator();
        Iterator<String> stringIterator = descendingSet.iterator();

        String classNameFromReflectionMethod = classNameFromReflection(strings);
        System.out.println("from variable: "+ classNameFromReflectionMethod);
        printSet(iterator);
        System.out.println("********************");
        classNameFromReflection(descendingSet);
        printSet(stringIterator);


    }

    private static <E> String classNameFromReflection (Collection<E> e ) {
        String className = e.getClass().getSimpleName();
        System.out.println(className);
        System.out.println(Arrays.toString(e.getClass().getInterfaces()));
        return className;
    }

    private static void printSet(Iterator<String> iterator) {
        int i = 0;
        while (iterator.hasNext()) {
            System.out.println("elem #" + i + ": " + iterator.next());
            i++;
        }
    }
}
