package alexei.anatsky.ITMO_konspect.GenericsPackage.RecursiveGeneric;

public class Hammer extends Product<Hammer> {
    private String weight;

    public Hammer(){}

    public Hammer(String weight) {
        this.weight = weight;
    }

    public Hammer(String name, int price, String weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    boolean subCompare(Hammer o) {
        if (this.weight.equals(o.weight)) {
            System.out.println("______________________________________");
            System.out.println("Our hammer and this one are identical");
            return true;
        } else {
            System.out.println("_________________________________________");
            System.out.println("Nope, Buddy. These hammers are different");
            return false;
        }
    }
}
