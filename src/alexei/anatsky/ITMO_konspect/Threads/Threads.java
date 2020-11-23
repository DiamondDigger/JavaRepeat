package alexei.anatsky.ITMO_konspect.Threads;

public class Threads {
    static class FirstThread implements Runnable {

        @Override
        public void run() {
            System.out.println("First Thread** method run...");
        }
    }

    static class SecondThread extends Thread{
        @Override
        public void run(){
            System.out.println("Second Thread** method run..");
        }
    }

    public static void main(String[] args) {
//
//        Runnable task = () -> {
//                System.out.println("Third Thread** method run..");
//        };

        Thread firstThread = new Thread(new FirstThread());
        SecondThread secondThread = new SecondThread();
        Thread thirdThread = new Thread(() -> {
                System.out.println("Third Thread** method run..");
            });

        firstThread.start();
        secondThread.start();
        thirdThread.start();

        firstThread.setName("Kali");
        System.out.println("firstThread.getName(): " + firstThread.getName());
        int priorityOfKali = firstThread.getPriority();
        System.out.println("priorityOfKali: " + priorityOfKali );
        System.out.println("firstThread.isAlive(): " + firstThread.isAlive());
        System.out.println("firstThread.isDaemon(): " + firstThread.isDaemon());
    }

}
