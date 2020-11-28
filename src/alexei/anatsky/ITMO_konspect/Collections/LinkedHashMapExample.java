package alexei.anatsky.ITMO_konspect.Collections;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        int i = 5;
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> linkedHashMapWithAccessOrder = new LinkedHashMap<>(i,1,true);
        Map<Integer, String> hashMap = new HashMap<>();

//        Charset charset = StandardCharsets.US_ASCII;
//        String a = "a";
//        byte[] asciiCode = a.getBytes(charset);
//        System.out.println(Arrays.toString(asciiCode));
//        System.out.println(asciiCode.length);
//
//        byte[] asciiCodeB = {(byte) (asciiCode[0] - 1)};
//        String bFromBytes = new String(asciiCodeB, charset);
//        System.out.println("bFromBytes: " + bFromBytes);

        int lowerBound = -1;
        byte step = 1;
        while (i > lowerBound) {
            String letter = asciiCodeToString(96, step);
            linkedHashMap.put(i, letter);
            linkedHashMapWithAccessOrder.put(i, letter);
            hashMap.put(i, letter);

            step++;
            i--;

        }

        linkedHashMapWithAccessOrder.get(3);
        linkedHashMapWithAccessOrder.get(5);
        linkedHashMapWithAccessOrder.get(1);

        printCollection(linkedHashMap);
        printCollection(linkedHashMapWithAccessOrder);

        printCollection(hashMap);

    }

    private static <E, K> void printCollection(Map<E, K> e) {
        System.out.println("__________________________");
        System.out.println(e.getClass().getSimpleName());
        System.out.println("***printing...***");
        e.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));
    }

    private static String asciiCodeToString(String letter, byte step) {
        Charset charset = StandardCharsets.US_ASCII;
        byte[] bytesFromString = letter.getBytes(charset);
        byte[] bytesForNewString = {(byte) (bytesFromString[0] + step)};

        return new String(bytesForNewString, charset);
    }

    private static String asciiCodeToString(int code, byte step) {
        Charset charset = StandardCharsets.US_ASCII;
        byte[] byteFromLetter = {(byte) code};
        byte[] bytesForNewString = {(byte) (byteFromLetter[0] + step)};

        return new String(bytesForNewString, charset);
    }
}
