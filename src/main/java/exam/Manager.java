package exam;

import java.util.Arrays;

public class Manager extends Employee{
    private  final double EXTRADISCOUNT = DISCOUNT + .05;
    private double salary;

    public Manager(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }
    public Manager(String name,double salary,Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
        this.salary = salary;
    }


    @Override
    public double printPriceAfterDiscount(Cloth cloth) {
        return  cloth.getPrice() - (cloth.getPrice() * EXTRADISCOUNT);
    }

    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public boolean payTaxOnEarnings() {
        return false;
    }

    @Override
    public boolean canGetFired() {
        return true;
    }

    public void setSalary(double salary) {
        if(salary > 0){
            this.salary = salary;
        }
        System.out.println("cant have negative salary");
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public void printInfo(Cloth [] cloths) {
        System.out.print(getName() + " Makes $" + getSalary() + " and his Shopping bag consists of : "  );
        for(Cloth p : cloths){
            System.out.print(p.getName() + " ");

        }
        System.out.println("");

    }
}
