package alexei.anatsky.ITMO_konspect.GenericsPackage;

public class Container <T extends Product & Comparable<T>> {
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
