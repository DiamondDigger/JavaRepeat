package ITMO_konspect;
import ITMO_konspect.ExampleInterface;

class ExampleClass implements ExampleInterface {

    @Override
    public void firstAPI_method() {
        System.out.println("First API method");
    }

    @Override
    public void secondAPI_method() {
        System.out.println("Second API method");
    }

    public void thirdAPI_method(){
        System.out.println("Override third default method");
    }

    public static void main(String[] args) {
        ExampleClass instance = new ExampleClass();

        System.out.println("**Start**");

        instance.firstAPI_method();
        instance.secondAPI_method();
        instance.thirdAPI_method();
        instance.fourthAPI_method();

        System.out.println("***End***");
    }

}

