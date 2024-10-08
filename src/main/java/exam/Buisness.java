package exam;

public class Buisness implements ITaxable, IPayable {
    private String name;
    private int productQtySupplied;
    private double productPrice;
    private double earnings;
    public Buisness(String name, int productQtySupplied, double productPrice) {
        this.name = name;
        this.productQtySupplied = productQtySupplied;
        this.productPrice = productPrice;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        if(earnings > 0){
            this.earnings = earnings;
        }else{
            System.out.println("no earnings found");
        }
    }

    @Override
    public boolean payTaxOnEarnings() {
        if(earnings > 100000){
            return true;
        }

        return false;
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
