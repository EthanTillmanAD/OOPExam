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
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String getClothName(Cloth[] cloths) {
        for(Cloth p : cloths){
            return p.name;
        }

        return "";
    }
}
