package alexei.anatsky.ITMO_konspect.GenericsPackage;

public class Phone extends Product {
    private int  model;

    public Phone() {
    }

    public Phone(int model) {
        this.model = model;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
