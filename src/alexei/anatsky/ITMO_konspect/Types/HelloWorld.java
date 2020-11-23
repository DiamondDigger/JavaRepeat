package alexei.anatsky.ITMO_konspect.Types;

import java.util.StringTokenizer;

import static java.lang.String.valueOf;

/**
 * Program write "Hello, World"
 * in a standard output flow
 * @version 2
 */
public class HelloWorld {
    private String name;

    public static void main(String[] args) throws CloneNotSupportedException {
        HelloWorld h;
        HelloWorld w;

        if (args.length > 0) {
            h = new HelloWorld((args[0]));
        } else {
            h = new HelloWorld(("World"));
        }

        w = new HelloWorld("World");

        h.sayHello();
        w.sayHello();

        System.out.println("Hash code of h:" + h.hashCode());
        System.out.println("Hash code of w:" + w.hashCode());


        Integer answer = 42;
        int intAnswer = answer;

        System.out.println("type of Integer answer: " + (answer instanceof Integer ? "Integer" : "Nope. Another one") );
        System.out.println("type of Integer answer: " + answer.getClass().getName());
        System.out.println("type of Integer answer: " + answer.getClass());
        System.out.println(intAnswer); System.out.println("h equals w : " + h.equals(w));

        // String

        String nameOne = "Jecky";
        String nameTwo = "Jecky";
        String nameThree = new String("Jecky");
        String nameFour = "Jecky D.";

        String headerOfCompany = "Jeremy";

        System.out.println("nameOne.charAt(4): " + nameOne.charAt(4));
        System.out.println("nameOne.compareTo(nameTwo): " + nameOne.compareTo(nameTwo));
        System.out.println("nameOne.compareTo(nameThree): " + nameOne.compareTo(nameThree));
        System.out.println("nameOne.compareTo(nameFour): " + nameOne.compareTo(nameFour));
        System.out.println("nameFour.matches(D.): " + nameFour.matches("D."));
        System.out.println("nameFour.matches(Jecky D.): " + nameFour.matches("Jecky D."));
        System.out.println(headerOfCompany.replace('e', 'a'));
        System.out.println(headerOfCompany);
        System.out.println(valueOf(42) instanceof String);

        // StringBuffer

        StringBuffer word = new StringBuffer("Kennedy");
        System.out.println("word.capacity(): " + word.capacity());
        System.out.println("word.length(): " + word.length());
        word.append(" ").append(nameFour);
        System.out.println("after append");
        System.out.println("word.capacity(): " + word.capacity());
        System.out.println("word.length(): " + word.length());
        System.out.println(word);
        System.out.println(word.insert(7, '-'));
        System.out.println(word.reverse());

        // StringTokenizer

        String sentence = "Hello, guys. I'm John Barret, " +
                " and today we have a.. let me think.." +
                "- best deal of our century!";

        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;-\n\r");
        System.out.println("tokenizer.countTokens(): " + tokenizer.countTokens());

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
            System.out.println("tokenizer.countTokens() - " + tokenizer.countTokens());
        }

        System.out.println("Second tokenizer");
        StringTokenizer st = new StringTokenizer("Jeremy loves pirelli ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken("e"));
        }

    }

    /**
     * Constructor creates object with settled name
     * @param s - name is a value for the new object
     */
    public HelloWorld(String s) {
        name = s;
    }

    /**
     * Method outputs "Hello" and the name
     * in a standard output flow
     */
    public void sayHello() {
        System.out.println("Hello, " + name + " !");
    }
}
