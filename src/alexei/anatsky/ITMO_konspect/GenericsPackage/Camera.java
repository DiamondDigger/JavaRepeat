package alexei.anatsky.ITMO_konspect.GenericsPackage;

public class Camera extends Product implements Comparable<Camera>{
    private int  pixel;

    public Camera() {
    }

    public Camera(int price) {
        super(price);
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    @Override
    public int compareTo(Camera o) {
        return 0;
    }
}
