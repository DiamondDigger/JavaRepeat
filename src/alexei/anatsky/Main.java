package alexei.anatsky;

public class Main {

    public static void main(String[] args) {
        int[] arrayInt = {5, 4, 3, 2, 45, 15, 34, 55, 2, 1, 0};

        pringMaxElemOfArray(arrayInt);
    }

    static void pringMaxElemOfArray(int[] arrayInt) {
        int max = arrayInt[0];
        int indexOfMax = 0;
        int replacements = 0;
        int comparisons = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            if (max < arrayInt[i]) {
                max = arrayInt[i];
                indexOfMax = i;
                replacements ++;
            }
            comparisons ++;
        }

        System.out.println("Max element: " + max);
        System.out.println("Max element index: " + indexOfMax);
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Replacements: " + replacements);
        System.out.println("Length of an array: " + arrayInt.length);
    }
}
