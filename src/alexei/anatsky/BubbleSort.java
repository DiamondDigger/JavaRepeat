package alexei.anatsky;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = {9, 8, 7, 5, 6, 4, 3, 2, -2, 15, 6};

        bubbleSort(intArray);

        for (int elem : intArray) {
            System.out.println("Elem: " + elem);
        }
    }

    static void bubbleSort(int[] array) {
        int comparisons = 0;
        int swaps = 0;
        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swaps++;
                    sorted = false;
                }
                comparisons++;
            }
        }
        System.out.println("Array length = " + array.length);
        System.out.println("Comparisons = " + comparisons);
        System.out.println("Swaps = " + swaps);
        System.out.println("_______________ ->");
    }
}
