package alexei.anatsky.ITMO_konspect.HelloWorldPackage;
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

        h.sayHello();

        w = new HelloWorld("World");

        w.sayHello();

        System.out.println("Hash code of h:" + h.hashCode());
        System.out.println("Hash code of w:" + w.hashCode());
        System.out.println("h equals w : " + h.equals(w));
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
