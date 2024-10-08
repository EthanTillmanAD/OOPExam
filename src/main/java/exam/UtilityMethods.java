package exam;

public class UtilityMethods {
    public static boolean checkFitting(Person person, Cloth cloth){

      if (cloth.getSize() == person.getSize()){
          return true;
      }else {
          return false;
      }



    }

    public static double calculateSubTotal(Cloth[] cloths){
        double total = 0;


        for(Cloth p : cloths){
            total += p.getPrice();

        }



        return total;
    }
    public static void printClassNamesOfPayableEntities(IPayable[] payables){
        for(IPayable p : payables){
            System.out.println(p.getClass());
        }
    }
    public static void checkCustomerDiscount(Customer customer){

      if(customer instanceof Manager){
          System.out.println(customer + " is a manager is entitled to a 15% discount");
      }else if(customer instanceof HourlyEmployee){
            System.out.println(customer + " is a Hourly employee is entitled to a 10% discount");
        }else if (customer instanceof Student){
          System.out.println(customer + " is a Student is entitled to a 5% discount");
      }



    }



}
