package alexei.anatsky;

public class BinarySort {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 11};
        int key = -99;
        int index = binarySort(intArray, key);
        System.out.println("Index of the key " + key + " is " + index);
    }

    static int binarySort(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        int middle = 0;
        int index = 0;

        if (key > array[right] || key < array[left]) {
            return -1;
        }

        while (left <= right) {

            middle = (left + right) / 2;

            if (key == array[middle]) {
                System.out.println("Found key " + key);
                return index = middle;
            }
            if (key > array[middle]) {
                left = middle + 1;
                System.out.println("Cut left side");
            }
            if (key < array[middle]) {
                right = middle - 1;
                System.out.println("Cut right side");
            }
        }
        return -1;
    }
}
