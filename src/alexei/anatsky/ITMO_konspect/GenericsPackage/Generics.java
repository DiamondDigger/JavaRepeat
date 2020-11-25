package alexei.anatsky.ITMO_konspect.GenericsPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generics <T extends Main & Comparable<T>>{
    public static void main(String[] args) {
        List rawList = new ArrayList();
        rawList.add(2);
        rawList.add("hey, man");
        rawList.add(1.2);
        rawList.add(.3f);
        rawList.add((byte)4);
        rawList.add((short)28);
        rawList.add('!');
        rawList.add(null);

        checkListItems(rawList);

        List<Integer> integerList = new ArrayList<>();
        Integer numberOne = 2;
        integerList.add(numberOne);
        integerList.add(null);
        integerList.add(4);

        List<String> stringList = new ArrayList<>();
//        stringList.add('d');
        stringList.add("d");
        stringList.add(null);
        stringList.add("10e3");

        List<Object> objectList = new ArrayList<>();

        checkIheritanceOfGeneric(stringList); //List<String> inheritance Collection<String>
        //compile Error
//        checkIheritanceOfGeneric(objectList); //List<Object> doesn't inheritance Collection<String>

        printListElem(stringList);
        printListElem(integerList);
    }

    private static void checkIheritanceOfGeneric (Collection<String> collection) {
        System.out.println("**String type of collection**");
    }

    private static <T> void printListElem(List<T> list) {
        int i = 0;
        for (T s : list) {
            if (i == 0) {
                System.out.println("Start of List.." + list.getClass().getSimpleName());
                System.out.println("size of List: " + list.size());
            }
            System.out.println("elem "+ i+" : " + s);
            if (i == list.size() - 1) {
                System.out.println("***End of List");
            }
            i++;
        }
    }

    private static void checkListItems(List list) {
        for (Object o : list) {
            if (o instanceof String) {
                System.out.println("String value: " + o);
            }
            if (o instanceof Integer) {
                System.out.println("Integer value: " + o);
            }
            if (o instanceof Byte) {
                System.out.println("Byte value: " + o);
            }
            if (o instanceof Short) {
                System.out.println("Short value: " + o);
            }
            if (o instanceof Long) {
                System.out.println("Long value: " + o);
            }
            if (o instanceof Double) {
                System.out.println("Double value: " + o);
            }
            if (o instanceof Float) {
                System.out.println("Float value: " + o);
            }
            if (o instanceof Character) {
                System.out.println("Character value: " + o);
            }
            if (o == null ) {
                System.out.println("null value: " + o);
            }
        }
    }
}
