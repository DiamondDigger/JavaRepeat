package alexei.anatsky.ITMO_konspect.ReflectionPackage;

public interface MovementInterface {
     final int stamina = 100;
     default void run() {
         System.out.println("I'm running now..");
     }

     public void walk();
     public void sit();
     public void jump();
     public void boost(int k);
     default int getStamina(){
         System.out.println("invoked stamina from interface");
         return stamina;
     }


}
