package alexei.anatsky.ITMO_konspect.ExceptionPackage;

public class ExceptionExample {
    static class FirstException extends Exception {}
    static class SecondException extends Exception {}

    public void rethrowException(String exceptionName) throws Exception {
        try {
            if (exceptionName.equals("First")) {
                throw new FirstException();
            } else {
                throw new SecondException();
            }
        } catch (Exception e) {
            System.out.println("From catch block " + e.getClass().getName());
            e.printStackTrace(); // print stack only in the end of programme
//            throw e;
        }
        finally {
            System.out.println("From finally block");
        }

        /* This code doesn't work in case of 'throw e;' method
         - this part is unreachable */
        System.out.println("After finally block");
        System.out.println("Division a by b : ");
        int a = 2;
        int b = 0;
        System.out.println("a = " + a +  "; b = " + b);
        try {
            System.out.println("a / b = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero - don't do like that!");
            System.out.println("Changed b = " + b);
            b = 2;
            e.printStackTrace();
        }

        System.out.println("a / b = " + (a / b));

    }

    public static void main(String[] args) throws Exception {
        ExceptionExample ex = new ExceptionExample();

        ex.rethrowException("hmm...");
    }
}
