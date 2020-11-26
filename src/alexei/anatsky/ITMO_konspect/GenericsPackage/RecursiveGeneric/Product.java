package alexei.anatsky.ITMO_konspect.GenericsPackage.RecursiveGeneric;

abstract public class Product<T extends Product<T>> implements Comparable<Product<T>> {
    private String name;
    private int price;

    public Product() {
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product<T> o) {
        if (this.price == o.price) {
            return 1;
        } else return 0;
    }

    abstract boolean subCompare(T o);

}
