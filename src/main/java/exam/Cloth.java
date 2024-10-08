package exam;

public class Cloth {
    private String name;
    private double price;
    private Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Cloth(String name, double price, Size size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }


    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }
}
