package ITMO_konspect;

public interface ExampleInterface {
    public void firstAPI_method();
    public void secondAPI_method();

    default void thirdAPI_method() {
        init();
    }
    default void fourthAPI_method() {
        init();
    }

// Java 9 feature
    private void init() {
        System.out.println("Initialization...");
    }
}

