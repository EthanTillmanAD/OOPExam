package exam;

public class HourlyEmployee extends Employee{
   private float hoursWorked;
   private double hourlyWage;

       public HourlyEmployee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }
    public HourlyEmployee(String name, float hoursWorked, double hourlyWage, Size size, Cloth[] clothingItems ) {
        super(name, size, clothingItems);
        //this.hourlyWage = hourlyWage;
        //this.hoursWorked = hoursWorked;
    }



    @Override
    public double printPriceAfterDiscount() {


           return 0;
    }

    @Override
    public double calculatePay() {
        return hourlyWage * hoursWorked;
    }

    @Override
    public boolean canGetFired() {

           return true;
    }

    @Override
    public boolean payTaxOnEarnings() {
        return true;
    }



    public void setHoursWorked(float hoursWorked) {
        if(hoursWorked > 0){
            this.hoursWorked = hoursWorked;
        }else{
            System.out.println("you cant work negative hours");

        }


    }
    public float getHoursWorked() {
        return hoursWorked;
    }
    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage > 0 ) {
            this.hourlyWage = hourlyWage;
        } else{
            System.out.println("you cant have a negative wage");
        }

    }
}
