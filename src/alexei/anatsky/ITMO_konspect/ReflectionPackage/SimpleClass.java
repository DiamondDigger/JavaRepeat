package alexei.anatsky.ITMO_konspect.ReflectionPackage;

import java.io.Serializable;

public class SimpleClass implements MovementInterface, Serializable {
    final private String type = "Human";

    private int stamina = getStamina();

    public int age;

    public SimpleClass() {
        System.out.println("Constructor has been invoked..");
        System.out.println("initial stamina is: " + stamina);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


//    @Override
//    public int getStamina() {
//        System.out.println("stamina from class" + stamina);
//        return stamina;
//    }

    @Override
    public void walk() {
        System.out.println("I'm walking now..");
        stamina -= 5;
    }

    @Override
    public void run() {
        System.out.println("I'm running now..");
        stamina -= 15;
    }

    @Override
    public void sit() {
        System.out.println("I'm sitting now..");
        stamina += 10;
    }

    @Override
    public void jump() {
        System.out.println("I jumped..");
        stamina -= 10;
    }

    @Override
    public void boost(int k) {
        this.stamina *= k;
        System.out.println("Stamina was boosted in "+k+" times\n new stamina: " + stamina);
    }

}
