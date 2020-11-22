package alexei.anatsky;

import java.lang.reflect.Array;

public class SortArray {
    public static void main(String[] args) {
        int[] arrayInt = {2, 5, 3, 1, 8};

        sortArray(arrayInt);
    }

    static void sortArray(int[] arrayInt) {
        int min = 0;
        int k = 0;
        int newMin = 0;
        int indexOfMin = 0;
        int replacement = 0;
        int comparison = 0;
        int lengthOfInput = arrayInt.length;
        int[] sortedArray = new int[lengthOfInput];
        boolean changed = false;

        for (int j = 0; j < arrayInt.length; j++) {
            min = arrayInt[j];
            for (int i = j; i < arrayInt.length; i++) {
                if (min > arrayInt[i]) {
                    newMin = arrayInt[i];
                    indexOfMin = i;
                    replacement++;
                    changed = true;
                }
                comparison++;
            }
            System.out.println("SortedArray[ " + j + "] = " + sortedArray[j]);
            if (sortedArray[j] == 0) {
                if (changed) {
                    sortedArray[j] = arrayInt[indexOfMin];
                    sortedArray[j + 1] = arrayInt[j];
                    k = j + 2;
                }
            } else if (k < arrayInt.length){
                sortedArray[k] = arrayInt[j];
                System.out.println("from else section");
            }else System.out.println("end of sorted Array");;

            System.out.println(sortedArray[j]);
        }

        for (int elem : sortedArray) {
            System.out.println("elem: " + elem);
        }
    }
}
