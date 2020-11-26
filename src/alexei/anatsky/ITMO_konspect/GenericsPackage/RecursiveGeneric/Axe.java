package alexei.anatsky.ITMO_konspect.GenericsPackage.RecursiveGeneric;

public class Axe extends Product<Axe>{
    private String sharpness;

    public Axe(){
    }

    @Override
    boolean subCompare(Axe o) {
        if (this.sharpness.equals(o.sharpness)) {
            System.out.println("___________________________________");
            System.out.println("Our axe and this one are identical");
            return true;
        } else {
            System.out.println("______________________________________");
            System.out.println("Nope, Buddy. These axes are different");
            return false;
        }
    }

    public Axe(String sharpness) {
        this.sharpness = sharpness;
    }

    public Axe(String name, int price, String sharpness) {
        super(name, price);
        this.sharpness = sharpness;
    }


}
