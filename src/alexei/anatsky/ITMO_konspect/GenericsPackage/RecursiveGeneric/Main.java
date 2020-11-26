package alexei.anatsky.ITMO_konspect.GenericsPackage.RecursiveGeneric;

public class Main {
    public static void main(String[] args) {
        Hammer expensiveSuperHammer = new Hammer("super heavy Hammer", 60, "super heavy");
        Hammer expensiveHammer = new Hammer("heavy Hammer", 60, "heavy");
        Hammer cheapHammer = new Hammer("light Hammer", 30, "light");
        Axe expensiveAxe = new Axe("sharp Axe",100,"sharp");
        Axe cheapAxe = new Axe("blunt Axe",50,"blunt");
        Product<Axe> unbelievableAxe = new Axe("unbelievable sharp", 500, "super sharp");
        printComparison(unbelievableAxe.compareTo(expensiveAxe));
        printComparison(unbelievableAxe.subCompare(expensiveAxe));

        Product<Axe> oneAxe = new Axe();
        Axe secondAxe = new Axe();
        Axe thirdAxe = new Axe();

        System.out.println("oneAxe.equals(secondAxe): " + oneAxe.equals(secondAxe));
        System.out.println("thirdAxe.equals(secondAxe): " + thirdAxe.equals(secondAxe));

        //compile error -
        // if class Product<T> all works
        // now class Product<T extend Product<T>>
//        Product<String> pencil = new Product<String>() {
//            @Override
//            boolean subCompare(String o) {
//                return false;
//            }
//        };

//        printComparison(expensiveHammer.compareTo(cheapHammer));
//        printComparison(expensiveHammer.compareTo(expensiveSuperHammer));
//        printComparison(expensiveHammer.subCompare(cheapHammer));
//        printComparison(expensiveHammer.subCompare(expensiveHammer));

        String word = "pokemon";
        int ansi = Integer.parseInt(word);
        System.out.println("ansi code of " + word + " is : " + ansi);
    }

    private static void printComparison(int comparison) {
        System.out.println("***Comparison by price");
        if (comparison == 1) {
            System.out.println("Great! They are the same");
        } else {
            System.out.println("Nope! They are different");
        }
    }
    private static void printComparison(boolean comparison) {
        System.out.println("***Comparison by distinctive features");
        if (comparison) {
            System.out.println("Great! They are the same");
        } else {
            System.out.println("Nope! They different");
        }
    }
}
