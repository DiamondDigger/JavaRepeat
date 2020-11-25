package alexei.anatsky.ITMO_konspect.GenericsPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product());
        productList.add(new Camera());
        productList.add(new Phone());

        List<Camera> cameraList = new ArrayList<>();
        cameraList.add(new Camera());
        cameraList.add(new Camera());
        //compile error
//        cameraList.add(new Product());

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone());
        //compile error
//        phoneList.add(new Camera());
//        phoneList.add(new Product());

        printList(productList);
        printList(cameraList);
        printList(phoneList);

        //compile error
//        Container<Product> container = new Container<>();

//        container.setItem(new Camera());
//        container.setItem(new Product());
//        container.setItem(new Phone());

        Container<Camera> cameraContainer = new Container<>();
        //compile error
//        Container<Phone> phoneContainer = new Container<>();

        cameraContainer.setItem(new Camera());
        //compile error
//        cameraContainer.setItem(new Phone());
//        cameraContainer.setItem(new Product());

        //compile error
//        Container<String> stringContainer;

        // list<Camera> != list<Product>
        find(cameraList, new Camera());
        //compile error
//        findT(cameraList, new Phone()); // T - i't exactly the same type for all args

        List<Product> finalCheckList = new ArrayList<>();
        copyList(cameraList, finalCheckList);
    }

    static void copyList(List<? extends Product> listIn, List<? super Product> listOut) {
        int i = 0;
        System.out.println("**Copying started..");
        for (Product product : listIn) {
            listOut.add(product);
            System.out.println("copy elem #" + i + " - "+ product.getClass().getSimpleName());
            i++;
        }
        System.out.println("**Successfully copied..**");
    }

    static boolean find(List<? extends Product> list, Product p) {
        for (Product product : list) {
            if (product.equals(p)) {
                return true;
            }
        }
        return false;
    }

    static <T extends Product> boolean findT(List<T> list, T p) {
        for (Product product : list) {
            if (product.equals(p)) {
                return true;
            }
        }
        return false;
    }

    static <T> void printList(List<T> list) {
        int i = 0;
        for (T t : list) {
            if (i == 0) {
                System.out.println("***Beginning of List***");
            }

            System.out.println("elem " + i + ": " + t.getClass().getSimpleName());

            if (i == list.size()) {
                System.out.println("***End of List***");
            }
            i++;
        }
    }

    static <T> void checkInheritance(Collection<T> collection) {
        System.out.println("inheritance in work");
    }
}
